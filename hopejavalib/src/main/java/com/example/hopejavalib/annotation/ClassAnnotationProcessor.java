package com.example.hopejavalib.annotation;

import com.google.auto.service.AutoService;

import javax.annotation.processing.*;
import javax.lang.model.SourceVersion;
import javax.lang.model.element.Element;
import javax.lang.model.element.TypeElement;
import javax.lang.model.util.Elements;
import java.lang.annotation.Annotation;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @description: ClassAnnotationProcessor
 * *
 * @author: hope
 * *
 * @create: 2020/5/27 2:29 PM
 */
@AutoService(Processor.class)
public class ClassAnnotationProcessor extends AbstractProcessor {

    private Elements element;
    private Filer filer;

    @Override
    public synchronized void init(ProcessingEnvironment processingEnv) {
        super.init(processingEnv);

// 这里从ProcessingEnvironment中获取我们需要的一些处理的工具，其实还有一些其他的东西
        element = processingEnv.getElementUtils();
        filer = processingEnv.getFiler();
    }

    @Override
    public Set<String> getSupportedAnnotationTypes() {
        //指定我们需要的processor type
        Set<String> types = new LinkedHashSet<>();
        Set<Class<? extends Annotation>> supportedAnnotations = getSupportAnnotations();

        for(Class<? extends Annotation> cls: supportedAnnotations){
            types.add(cls.getCanonicalName());
        }

        return types;
    }

    /**
    设置我们需要进行编译的annotation
     */
    private Set<Class<? extends Annotation>> getSupportAnnotations(){
        Set<Class<? extends Annotation>> annotations = new LinkedHashSet<>();
        annotations.add(ClassAnnotation.class);
        return annotations;
    }

    @Override
    public SourceVersion getSupportedSourceVersion() {
        return super.getSupportedSourceVersion();
    }

    /**
     * 真正生成java代码的地方
     * @param annotations 请求处理的注解类型集合
     * @param roundEnv 可以让你查询出包含特定注解的被注解元素，相当于“有关全局源码的上下文环境”
     * @return
     */
    @Override
    public boolean process(Set<? extends TypeElement> annotations, RoundEnvironment roundEnv) {
        Set<? extends Element> elements = roundEnv.getElementsAnnotatedWith(ClassAnnotation.class);

        for(Element element: elements){

        }


        return false;
    }
}
