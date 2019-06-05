package com.springboot.mybatisplus.generator;


import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.core.exceptions.MybatisPlusException;
import com.baomidou.mybatisplus.core.toolkit.StringPool;
import com.baomidou.mybatisplus.core.toolkit.StringUtils;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.InjectionConfig;
import com.baomidou.mybatisplus.generator.config.*;
import com.baomidou.mybatisplus.generator.config.po.TableInfo;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 代码生成器
 */
public class MpGenerator{

    /**
     * <p>
     * 读取控制台内容
     * </p>
     */
    public static String scanner(String tip) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder help = new StringBuilder();
        help.append("请输入" + tip + "：");
        System.out.println(help.toString());
        if (scanner.hasNext()) {
            String ipt = scanner.next();
            if (StringUtils.isNotEmpty(ipt)) {
                return ipt;
            }
        }
        throw new MybatisPlusException("请输入正确的" + tip + "！");
    }

    public static void main(String[] args) {

        // 代码生成器
        AutoGenerator mpg = new AutoGenerator();

        /** 全局配置---开始**/
        GlobalConfig gc = new GlobalConfig();
        String projectPath = "F:/github/antonio-mybatis";
        gc.setOutputDir(projectPath + "/src/main/java")
        .setAuthor("Antonio")  //Mapper,Service类注解中显示创建人信息
        .setFileOverride(true) // 是否覆盖文件
        .setActiveRecord(true) // 开启 activeRecord 模式
        //.setIdType(IdType.AUTO) // 主键策略
        .setEnableCache(false) // XML 二级缓存
        .setBaseColumnList(true) //在Mapper.xml文件中是否生成公用SQL代码段
        .setBaseResultMap(true)  //在Mapper.xml文件中是否生成公用返回集合ResultMap
        .setOpen(false);  //文件生成完毕后，是否需要打开所在路径
        // 自定义文件命名，注意 %s 会自动填充表实体属性！
        //.setEntityName("%sEntity")
        //.setMapperName("%sDao")
        //.setXmlName("%sMapper")
        //.setServiceName("I%sService")
        //.setServiceImplName("%sServiceImpl")
        //.setControllerName("%sController")

        mpg.setGlobalConfig(gc);
        /** 全局配置---结束**/

        /** 数据源配置---开始**/
        DataSourceConfig dsc = new DataSourceConfig();
        dsc.setDbType(DbType.MYSQL)// 数据库类型
        .setUrl("jdbc:mysql://localhost:3306/pinyougoudb?serverTimezone=UTC&useUnicode=true&useSSL=false&characterEncoding=utf8")
        .setDriverName("com.mysql.cj.jdbc.Driver")
        .setUsername("root")
        .setPassword("root");

        mpg.setDataSource(dsc);
        /** 数据源配置---结束**/

        /** 包配置---开始**/
        PackageConfig pc = new PackageConfig();
        pc.setParent("com.springboot.mybatisplus"); //父级公用包名，就是自动生成的文件放在项目路径下的那个包中
        //.setController("controller");//controller 这里是控制器包名
        //.setMapper("mapper")//dao
        //.setService("service")//servcie
        //.setEntity("entity")
        //.setXml("mapper");//mapper.xml

        mpg.setPackageInfo(pc);
        /** 包配置---结束**/

       /** 自定义配置---开始**/
        InjectionConfig cfg = new InjectionConfig() {
            @Override
            public void initMap() {
                // to do nothing
            }
        };

        // 如果模板引擎是 freemarker
        String templatePath = "/templates/mapper.xml.ftl";
        // 如果模板引擎是 velocity
        // String templatePath = "/templates/mapper.xml.vm";
        // 自定义输出配置
        List<FileOutConfig> focList = new ArrayList<>();
        // 自定义配置会被优先输出
        focList.add(new FileOutConfig(templatePath) {
            @Override
            public String outputFile(TableInfo tableInfo) {
                // 自定义Mapper.xml文件存放的路径
                return projectPath + "/src/main/resources/mapper/"
                        + tableInfo.getEntityName() + "Mapper" + StringPool.DOT_XML;
            }
        });
        cfg.setFileOutConfigList(focList);

        mpg.setCfg(cfg);
        /** 自定义配置---结束**/

        /** 配置模板**/
        mpg.setTemplate(new TemplateConfig().setXml(null));

        /** 策略配置---开始**/
        StrategyConfig strategy = new StrategyConfig();
        // .setCapitalMode(true)// 全局大写命名
        // .setDbColumnUnderline(true)//全局下划线命名,指定表名 字段名是否使用下划线
        strategy.setNaming(NamingStrategy.underline_to_camel) //Entity文件名称命名规范
        .setColumnNaming(NamingStrategy.underline_to_camel) //Entity字段名称
        .setEntityLombokModel(true) //是否使用lombok完成Entity实体标注Getting Setting ToString 方法
        //strategy.setRestControllerStyle(true); //Controller注解使用是否RestController标注,否则是否开启使用Controller标注
        .entityTableFieldAnnotationEnable(true) //是否在Entity属性上通过注解完成对数据库字段的映射
        .setInclude(scanner("表名，多个英文逗号分割").split(",")) //设置需要生成的表
        // .setInclude(new String[] { "user" }) // 需要生成的表
        //  .setExclude(new String[]{"test"}); // 排除生成的表
        // .setSuperEntityClass("com.baomidou.demo.TestEntity"); // 自定义实体父类
        // .setSuperEntityColumns(new String[]{"test_id"}) // 自定义实体，公共字段
        //.setSuperMapperClass("com.baomidou.demo.TestMapper") // 自定义 mapper 父类
        // .setSuperServiceClass("com.baomidou.demo.TestService") // 自定义 service 父类
        // .setSuperServiceImplClass("com.baomidou.demo.TestServiceImpl")// 自定义 service 实现类父类
        // .setSuperControllerClass("com.baomidou.demo.TestController")// 自定义 controller 父类
        // 【实体】是否生成字段常量（默认 false）
        // public static final String ID = "test_id";
        // .setEntityColumnConstant(true)
        // 【实体】是否为构建者模型（默认 false）
        // public User setName(String name) {this.name = name; return this;}
        // .setEntityBuilderModel(true)
        // 【实体】是否为lombok模型（默认 false）<a href="https://projectlombok.org/">document</a>
        // .setEntityLombokModel(true)
        // Boolean类型字段是否移除is前缀处理
        // .setEntityBooleanColumnRemoveIsPrefix(true)
        // .setControllerMappingHyphenStyle(true)
        .setControllerMappingHyphenStyle(false)  //Controller注解名称，不使用驼峰，使用连字符
        .setTablePrefix("tb_");  //表前缀，添加该表示，则生成的实体，不会有表前缀，比如sys_dept 生成就是Dept
        //strategy.setFieldPrefix("tb_");  //字段前缀

        mpg.setStrategy(strategy);
        /** 策略配置---结束**/

        mpg.setTemplateEngine(new FreemarkerTemplateEngine());
        mpg.execute();
    }


}
