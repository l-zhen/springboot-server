package com.keafmd.mp;

import com.baomidou.mybatisplus.core.exceptions.MybatisPlusException;
import com.baomidou.mybatisplus.core.toolkit.StringPool;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.InjectionConfig;
import com.baomidou.mybatisplus.generator.config.*;
import com.baomidou.mybatisplus.generator.config.po.TableInfo;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;
import org.junit.jupiter.api.Test;
import org.junit.platform.commons.util.StringUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 代码生成器
 * @Author lz
 * @Date 2022/3/9 18:51
 * @Version 1.0
 */
public class CodeGenerator {
    /**
     * 读取控制台内容
     * @param tip
     * @return
     */
    public static String scanner(String tip){
        Scanner scanner = new Scanner(System.in);
        StringBuilder help = new StringBuilder();
        help.append("请输入" + tip + ":");
        System.out.println(help.toString());
        if (scanner.hasNext()){
            String ipt = scanner.next();
            if (StringUtils.isNotBlank(ipt)){
                return ipt;
            }
        }
        throw new MybatisPlusException("请输入正确的" + tip + "!");
    }

    public static void main(String[] args)  {
        //代码生成器
        AutoGenerator mpg = new AutoGenerator();

        //全局配置
        GlobalConfig gc = new GlobalConfig();
        //获取当前项目目录，如果不设置代码会生成到本地的别的地方里
        final String projectPath = System.getProperty("user.dir");
        System.out.println("projectPath = " + projectPath);
        //设置生成文件目录
        gc.setOutputDir(projectPath + "/src/main/java");
        //设置作者
        gc.setAuthor("leizhen");
        //设置生成完毕是否打开文件夹
        gc.setOpen(false);
        gc.setServiceName("%sService");
        mpg.setGlobalConfig(gc);

        //数据源配置
        DataSourceConfig dsc = new DataSourceConfig();
        dsc.setUrl("jdbc:mysql://127.0.0.1:3306/data_test?useUnicode=true&useSSL=false&characterEncoding=utf8&serverTimezone=UTC");
        dsc.setDriverName("com.mysql.cj.jdbc.Driver");
        dsc.setUsername("root");
        dsc.setPassword("lz19980803");
        mpg.setDataSource(dsc);

        //包配置
        PackageConfig pc = new PackageConfig();
        //设置模块的名字（包名），生成的代码会放在这里面
        pc.setModuleName(null);
        //父类
        pc.setParent("com.keafmd");
        mpg.setPackageInfo(pc);

        //自定义配置
        InjectionConfig cfg = new InjectionConfig() {
            @Override
            public void initMap() {
                //to do nothing
            }
        };

        // 如果模板引擎是 freemarker
        String templatePath = "/templates/mapper.xml.ftl";
        // 如果模板引擎是 velocity
//        String templatePath = "/templates/mapper.xml.vm";
        //自定义输出配置
        List<FileOutConfig> focList = new ArrayList<>();
        focList.add(new FileOutConfig(templatePath) {
            @Override
            public String outputFile(TableInfo tableInfo) {
                //自定义输出文件名，如果Entity设置了前后缀，此处xml的名称会跟着发生变化
                return projectPath + "/src/main/resources/com/keafmd/mapper/" + tableInfo.getEntityName() + "Mapper" + StringPool.DOT_XML;
            }
        });

        cfg.setFileOutConfigList(focList);
        mpg.setCfg(cfg);

        //配置模板
        TemplateConfig templateConfig = new TemplateConfig();
        templateConfig.setXml(null);
        mpg.setTemplate(templateConfig);

        //策略配置
        StrategyConfig strategyConfig = new StrategyConfig();
        //转驼峰命名
        strategyConfig.setNaming(NamingStrategy.underline_to_camel);
        //转驼峰命名
        strategyConfig.setColumnNaming(NamingStrategy.underline_to_camel);
        //自动lombok
        strategyConfig.setEntityLombokModel(true);
        //controller中restful式风格（驼峰或者下划线）
        strategyConfig.setRestControllerStyle(true);
        //设置需要构建的数据库表名
        strategyConfig.setInclude(scanner("表名，多个英文逗号分割").split(","));
        strategyConfig.setControllerMappingHyphenStyle(true);
        strategyConfig.setTablePrefix("m_");
        mpg.setStrategy(strategyConfig);
        mpg.setTemplateEngine(new FreemarkerTemplateEngine());
        mpg.execute();
    }
}
