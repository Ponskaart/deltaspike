package nl.infosupport.deltaspike;

import org.jboss.weld.environment.se.Weld;
import org.jboss.weld.environment.se.WeldContainer;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class DeltaSpikeDataTests {

    @Test
    @DisplayName("Get DeltaSpike running!...please")
    void setUpIsAwesome(){
        Weld weld = new Weld();

        try(WeldContainer weldContainer = weld.initialize();){
            RegisterBookService registerBookService = weldContainer.select(RegisterBookService.class).get();
            registerBookService.remove();

        }
    }

    @Test
    @DisplayName("java.lang.TypeNotPresentException: Type javax.enterprise.inject.Any not present\n" +
            "\n" +
            "\tat java.base/java.lang.reflect.Method.getDefaultValue(Method.java:682)\n" +
            "\tat java.base/sun.reflect.annotation.AnnotationType.<init>(AnnotationType.java:132)\n" +
            "\tat java.base/sun.reflect.annotation.AnnotationType.getInstance(AnnotationType.java:85)\n" +
            "\tat java.base/sun.reflect.annotation.AnnotationParser.parseAnnotation2(AnnotationParser.java:267)\n" +
            "\tat java.base/sun.reflect.annotation.AnnotationParser.parseAnnotations2(AnnotationParser.java:121)\n" +
            "\tat java.base/sun.reflect.annotation.AnnotationParser.parseAnnotations(AnnotationParser.java:73)\n" +
            "\tat java.base/java.lang.reflect.Executable.declaredAnnotations(Executable.java:604)\n" +
            "\tat java.base/java.lang.reflect.Executable.declaredAnnotations(Executable.java:602)\n" +
            "\tat java.base/java.lang.reflect.Executable.getDeclaredAnnotations(Executable.java:590)\n" +
            "\tat java.base/java.lang.reflect.Method.getDeclaredAnnotations(Method.java:703)\n" +
            "\tat java.base/java.lang.reflect.AccessibleObject.getAnnotations(AccessibleObject.java:533)\n" +
            "\tat org.jboss.weld.resources.HotspotReflectionCache.internalGetAnnotations(HotspotReflectionCache.java:58)\n" +
            "\tat org.jboss.weld.resources.DefaultReflectionCache.lambda$new$0(DefaultReflectionCache.java:40)\n" +
            "\tat org.jboss.weld.util.cache.ReentrantMapBackedComputingCache.lambda$new$0(ReentrantMapBackedComputingCache.java:55)\n" +
            "\tat org.jboss.weld.util.LazyValueHolder$1.computeValue(LazyValueHolder.java:32)\n" +
            "\tat org.jboss.weld.util.LazyValueHolder.get(LazyValueHolder.java:46)\n" +
            "\tat org.jboss.weld.util.cache.ReentrantMapBackedComputingCache.getValue(ReentrantMapBackedComputingCache.java:72)\n" +
            "\tat org.jboss.weld.resources.DefaultReflectionCache.getAnnotations(DefaultReflectionCache.java:75)\n" +
            "\tat org.jboss.weld.annotated.slim.backed.BackedAnnotated.getAnnotations(BackedAnnotated.java:36)\n" +
            "\tat org.jboss.weld.annotated.enhanced.jlr.EnhancedAnnotatedMethodImpl.of(EnhancedAnnotatedMethodImpl.java:61)\n" +
            "\tat org.jboss.weld.annotated.enhanced.jlr.EnhancedAnnotatedTypeImpl.<init>(EnhancedAnnotatedTypeImpl.java:224)\n" +
            "\tat org.jboss.weld.annotated.enhanced.jlr.EnhancedAnnotatedTypeImpl.of(EnhancedAnnotatedTypeImpl.java:134)\n" +
            "\tat org.jboss.weld.resources.ClassTransformer$TransformSlimAnnotatedTypeToEnhancedAnnotatedType.apply(ClassTransformer.java:93)\n" +
            "\tat org.jboss.weld.resources.ClassTransformer$TransformSlimAnnotatedTypeToEnhancedAnnotatedType.apply(ClassTransformer.java:90)\n" +
            "\tat org.jboss.weld.util.cache.ReentrantMapBackedComputingCache.lambda$new$0(ReentrantMapBackedComputingCache.java:55)\n" +
            "\tat org.jboss.weld.util.LazyValueHolder$1.computeValue(LazyValueHolder.java:32)\n" +
            "\tat org.jboss.weld.util.LazyValueHolder.get(LazyValueHolder.java:46)\n" +
            "\tat org.jboss.weld.util.cache.ReentrantMapBackedComputingCache.getValue(ReentrantMapBackedComputingCache.java:72)\n" +
            "\tat org.jboss.weld.resources.ClassTransformer.getEnhancedAnnotatedType(ClassTransformer.java:251)\n" +
            "\tat org.jboss.weld.bootstrap.BeanDeployer.createClassBean(BeanDeployer.java:210)\n" +
            "\tat org.jboss.weld.bootstrap.ConcurrentBeanDeployer$2.doWork(ConcurrentBeanDeployer.java:68)\n" +
            "\tat org.jboss.weld.bootstrap.ConcurrentBeanDeployer$2.doWork(ConcurrentBeanDeployer.java:65)\n" +
            "\tat org.jboss.weld.executor.IterativeWorkerTaskFactory$1.call(IterativeWorkerTaskFactory.java:62)\n" +
            "\tat org.jboss.weld.executor.IterativeWorkerTaskFactory$1.call(IterativeWorkerTaskFactory.java:55)\n" +
            "\tat org.jboss.weld.executor.CommonForkJoinPoolExecutorServices.lambda$wrap$0(CommonForkJoinPoolExecutorServices.java:70)\n" +
            "\tat java.base/java.util.concurrent.ForkJoinTask$AdaptedCallable.exec(ForkJoinTask.java:1448)\n" +
            "\tat java.base/java.util.concurrent.ForkJoinTask.doExec(ForkJoinTask.java:290)\n" +
            "\tat java.base/java.util.concurrent.ForkJoinPool$WorkQueue.topLevelExec(ForkJoinPool.java:1020)\n" +
            "\tat java.base/java.util.concurrent.ForkJoinPool.scan(ForkJoinPool.java:1656)\n" +
            "\tat java.base/java.util.concurrent.ForkJoinPool.runWorker(ForkJoinPool.java:1594)\n" +
            "\tat java.base/java.util.concurrent.ForkJoinWorkerThread.run(ForkJoinWorkerThread.java:183)\n" +
            "Caused by: java.lang.ClassNotFoundException: javax.enterprise.inject.Any\n" +
            "\tat java.base/jdk.internal.loader.BuiltinClassLoader.loadClass(BuiltinClassLoader.java:581)\n" +
            "\tat java.base/jdk.internal.loader.ClassLoaders$AppClassLoader.loadClass(ClassLoaders.java:178)\n" +
            "\tat java.base/java.lang.ClassLoader.loadClass(ClassLoader.java:522)\n" +
            "\tat java.base/java.lang.Class.forName0(Native Method)\n" +
            "\tat java.base/java.lang.Class.forName(Class.java:398)\n" +
            "\tat java.base/sun.reflect.generics.factory.CoreReflectionFactory.makeNamedType(CoreReflectionFactory.java:114)\n" +
            "\tat java.base/sun.reflect.generics.visitor.Reifier.visitClassTypeSignature(Reifier.java:125)\n" +
            "\tat java.base/sun.reflect.generics.tree.ClassTypeSignature.accept(ClassTypeSignature.java:49)\n" +
            "\tat java.base/sun.reflect.annotation.AnnotationParser.parseSig(AnnotationParser.java:440)\n" +
            "\tat java.base/sun.reflect.annotation.AnnotationParser.parseClassValue(AnnotationParser.java:421)\n" +
            "\tat java.base/sun.reflect.annotation.AnnotationParser.lambda$parseClassArray$0(AnnotationParser.java:719)\n" +
            "\tat java.base/sun.reflect.annotation.AnnotationParser.parseArrayElements(AnnotationParser.java:747)\n" +
            "\tat java.base/sun.reflect.annotation.AnnotationParser.parseClassArray(AnnotationParser.java:718)\n" +
            "\tat java.base/sun.reflect.annotation.AnnotationParser.parseArray(AnnotationParser.java:532)\n" +
            "\tat java.base/sun.reflect.annotation.AnnotationParser.parseMemberValue(AnnotationParser.java:356)\n" +
            "\tat java.base/java.lang.reflect.Method.getDefaultValue(Method.java:674)\n" +
            "\t... 40 more")
    void tryToUnderstandException(){
        /*
            Properties that result in this exception:
        <maven.compiler.source>11</maven.compiler.source>
        <maven.compiler.target>11</maven.compiler.target>
        <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
        <deltaspike.version>1.9.6</deltaspike.version>
        <weld.se.shaded-version>4.0.3.Final</weld.se.shaded-version>
        <latest.log4j.version>2.19.0</latest.log4j.version>
        <latest.jdbc.postgres.driver>42.5.0</latest.jdbc.postgres.driver>
         */
    }


    @Test
    @DisplayName("org.apache.deltaspike.data.api.QueryInvocationException: Failed calling Repository: [Repository=nl.infosupport.deltaspike.BookRepository,entity=nl.infosupport.deltaspike.Book,method=remove,exception=class org.apache.deltaspike.data.api.QueryInvocationException,message=Failed calling Repository: [Repository=nl.infosupport.deltaspike.BookRepository,entity=nl.infosupport.deltaspike.Book,method=remove,exception=class org.apache.deltaspike.data.api.QueryInvocationException,message=Failed calling Repository: [Repository=nl.infosupport.deltaspike.BookRepository,entity=nl.infosupport.deltaspike.Book,method=remove,exception=class java.lang.reflect.InvocationTargetException,message=null\n" +
            "\n" +
            "\tat org.apache.deltaspike.data.impl.handler.QueryHandler.process(QueryHandler.java:163)\n" +
            "\tat org.apache.deltaspike.data.impl.handler.QueryHandler.invoke(QueryHandler.java:130)\n" +
            "\tat org.apache.deltaspike.data.impl.handler.QueryHandler$Proxy$_$$_WeldClientProxy.invoke(Unknown Source)\n" +
            "\tat org.apache.deltaspike.proxy.spi.invocation.DeltaSpikeProxyInvocationHandler.proceed(DeltaSpikeProxyInvocationHandler.java:97)\n" +
            "\tat org.apache.deltaspike.proxy.spi.invocation.DeltaSpikeProxyInvocationHandler.invoke(DeltaSpikeProxyInvocationHandler.java:78)\n" +
            "\tat org.apache.deltaspike.proxy.spi.invocation.DeltaSpikeProxyInvocationHandler$Proxy$_$$_WeldClientProxy.invoke(Unknown Source)\n" +
            "\tat nl.infosupport.deltaspike.BookRepository$$DSPartialBeanProxy.remove(Unknown Source)\n" +
            "\tat nl.infosupport.deltaspike.RegisterBookService.remove(RegisterBookService.java:20)\n" +
            "\tat nl.infosupport.deltaspike.DeltaSpikeDataTests.setUpIsAwesome(DeltaSpikeDataTests.java:17)\n" +
            "\tat java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\n" +
            "\tat java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\n" +
            "\tat java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\n" +
            "\tat java.base/java.lang.reflect.Method.invoke(Method.java:566)\n" +
            "\tat org.junit.platform.commons.util.ReflectionUtils.invokeMethod(ReflectionUtils.java:727)\n" +
            "\tat org.junit.jupiter.engine.execution.MethodInvocation.proceed(MethodInvocation.java:60)\n" +
            "\tat org.junit.jupiter.engine.execution.InvocationInterceptorChain$ValidatingInvocation.proceed(InvocationInterceptorChain.java:131)\n" +
            "\tat org.junit.jupiter.engine.extension.TimeoutExtension.intercept(TimeoutExtension.java:156)\n" +
            "\tat org.junit.jupiter.engine.extension.TimeoutExtension.interceptTestableMethod(TimeoutExtension.java:147)\n" +
            "\tat org.junit.jupiter.engine.extension.TimeoutExtension.interceptTestMethod(TimeoutExtension.java:86)\n" +
            "\tat org.junit.jupiter.engine.execution.InterceptingExecutableInvoker$ReflectiveInterceptorCall.lambda$ofVoidMethod$0(InterceptingExecutableInvoker.java:103)\n" +
            "\tat org.junit.jupiter.engine.execution.InterceptingExecutableInvoker.lambda$invoke$0(InterceptingExecutableInvoker.java:93)\n" +
            "\tat org.junit.jupiter.engine.execution.InvocationInterceptorChain$InterceptedInvocation.proceed(InvocationInterceptorChain.java:106)\n" +
            "\tat org.junit.jupiter.engine.execution.InvocationInterceptorChain.proceed(InvocationInterceptorChain.java:64)\n" +
            "\tat org.junit.jupiter.engine.execution.InvocationInterceptorChain.chainAndInvoke(InvocationInterceptorChain.java:45)\n" +
            "\tat org.junit.jupiter.engine.execution.InvocationInterceptorChain.invoke(InvocationInterceptorChain.java:37)\n" +
            "\tat org.junit.jupiter.engine.execution.InterceptingExecutableInvoker.invoke(InterceptingExecutableInvoker.java:92)\n" +
            "\tat org.junit.jupiter.engine.execution.InterceptingExecutableInvoker.invoke(InterceptingExecutableInvoker.java:86)\n" +
            "\tat org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.lambda$invokeTestMethod$7(TestMethodTestDescriptor.java:217)\n" +
            "\tat org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)\n" +
            "\tat org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.invokeTestMethod(TestMethodTestDescriptor.java:213)\n" +
            "\tat org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.execute(TestMethodTestDescriptor.java:138)\n" +
            "\tat org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.execute(TestMethodTestDescriptor.java:68)\n" +
            "\tat org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$6(NodeTestTask.java:151)\n" +
            "\tat org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)\n" +
            "\tat org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$8(NodeTestTask.java:141)\n" +
            "\tat org.junit.platform.engine.support.hierarchical.Node.around(Node.java:137)\n" +
            "\tat org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$9(NodeTestTask.java:139)\n" +
            "\tat org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)\n" +
            "\tat org.junit.platform.engine.support.hierarchical.NodeTestTask.executeRecursively(NodeTestTask.java:138)\n" +
            "\tat org.junit.platform.engine.support.hierarchical.NodeTestTask.execute(NodeTestTask.java:95)\n" +
            "\tat java.base/java.util.ArrayList.forEach(ArrayList.java:1541)\n" +
            "\tat org.junit.platform.engine.support.hierarchical.SameThreadHierarchicalTestExecutorService.invokeAll(SameThreadHierarchicalTestExecutorService.java:41)\n" +
            "\tat org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$6(NodeTestTask.java:155)\n" +
            "\tat org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)\n" +
            "\tat org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$8(NodeTestTask.java:141)\n" +
            "\tat org.junit.platform.engine.support.hierarchical.Node.around(Node.java:137)\n" +
            "\tat org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$9(NodeTestTask.java:139)\n" +
            "\tat org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)\n" +
            "\tat org.junit.platform.engine.support.hierarchical.NodeTestTask.executeRecursively(NodeTestTask.java:138)\n" +
            "\tat org.junit.platform.engine.support.hierarchical.NodeTestTask.execute(NodeTestTask.java:95)\n" +
            "\tat java.base/java.util.ArrayList.forEach(ArrayList.java:1541)\n" +
            "\tat org.junit.platform.engine.support.hierarchical.SameThreadHierarchicalTestExecutorService.invokeAll(SameThreadHierarchicalTestExecutorService.java:41)\n" +
            "\tat org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$6(NodeTestTask.java:155)\n" +
            "\tat org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)\n" +
            "\tat org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$8(NodeTestTask.java:141)\n" +
            "\tat org.junit.platform.engine.support.hierarchical.Node.around(Node.java:137)\n" +
            "\tat org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$9(NodeTestTask.java:139)\n" +
            "\tat org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)\n" +
            "\tat org.junit.platform.engine.support.hierarchical.NodeTestTask.executeRecursively(NodeTestTask.java:138)\n" +
            "\tat org.junit.platform.engine.support.hierarchical.NodeTestTask.execute(NodeTestTask.java:95)\n" +
            "\tat org.junit.platform.engine.support.hierarchical.SameThreadHierarchicalTestExecutorService.submit(SameThreadHierarchicalTestExecutorService.java:35)\n" +
            "\tat org.junit.platform.engine.support.hierarchical.HierarchicalTestExecutor.execute(HierarchicalTestExecutor.java:57)\n" +
            "\tat org.junit.platform.engine.support.hierarchical.HierarchicalTestEngine.execute(HierarchicalTestEngine.java:54)\n" +
            "\tat org.junit.platform.launcher.core.EngineExecutionOrchestrator.execute(EngineExecutionOrchestrator.java:147)\n" +
            "\tat org.junit.platform.launcher.core.EngineExecutionOrchestrator.execute(EngineExecutionOrchestrator.java:127)\n" +
            "\tat org.junit.platform.launcher.core.EngineExecutionOrchestrator.execute(EngineExecutionOrchestrator.java:90)\n" +
            "\tat org.junit.platform.launcher.core.EngineExecutionOrchestrator.lambda$execute$0(EngineExecutionOrchestrator.java:55)\n" +
            "\tat org.junit.platform.launcher.core.EngineExecutionOrchestrator.withInterceptedStreams(EngineExecutionOrchestrator.java:102)\n" +
            "\tat org.junit.platform.launcher.core.EngineExecutionOrchestrator.execute(EngineExecutionOrchestrator.java:54)\n" +
            "\tat org.junit.platform.launcher.core.DefaultLauncher.execute(DefaultLauncher.java:114)\n" +
            "\tat org.junit.platform.launcher.core.DefaultLauncher.execute(DefaultLauncher.java:86)\n" +
            "\tat org.junit.platform.launcher.core.DefaultLauncherSession$DelegatingLauncher.execute(DefaultLauncherSession.java:86)\n" +
            "\tat org.junit.platform.launcher.core.SessionPerRequestLauncher.execute(SessionPerRequestLauncher.java:53)\n" +
            "\tat com.intellij.junit5.JUnit5IdeaTestRunner.startRunnerWithArgs(JUnit5IdeaTestRunner.java:57)\n" +
            "\tat com.intellij.rt.junit.IdeaTestRunner$Repeater$1.execute(IdeaTestRunner.java:38)\n" +
            "\tat com.intellij.rt.execution.junit.TestsRepeater.repeat(TestsRepeater.java:11)\n" +
            "\tat com.intellij.rt.junit.IdeaTestRunner$Repeater.startRunnerWithArgs(IdeaTestRunner.java:35)\n" +
            "\tat com.intellij.rt.junit.JUnitStarter.prepareStreamsAndStart(JUnitStarter.java:235)\n" +
            "\tat com.intellij.rt.junit.JUnitStarter.main(JUnitStarter.java:54)\n" +
            "Caused by: org.apache.deltaspike.data.api.QueryInvocationException: Failed calling Repository: [Repository=nl.infosupport.deltaspike.BookRepository,entity=nl.infosupport.deltaspike.Book,method=remove,exception=class org.apache.deltaspike.data.api.QueryInvocationException,message=Failed calling Repository: [Repository=nl.infosupport.deltaspike.BookRepository,entity=nl.infosupport.deltaspike.Book,method=remove,exception=class java.lang.reflect.InvocationTargetException,message=null\n" +
            "\tat org.apache.deltaspike.data.impl.builder.DelegateQueryBuilder.execute(DelegateQueryBuilder.java:81)\n" +
            "\tat org.apache.deltaspike.data.impl.builder.QueryBuilder.executeQuery(QueryBuilder.java:57)\n" +
            "\tat org.apache.deltaspike.data.impl.builder.DelegateQueryBuilder$Proxy$_$$_WeldClientProxy.executeQuery(Unknown Source)\n" +
            "\tat org.apache.deltaspike.data.impl.tx.TransactionalQueryRunner.executeNonTransactional(TransactionalQueryRunner.java:62)\n" +
            "\tat org.apache.deltaspike.data.impl.tx.TransactionalQueryRunner.executeQuery(TransactionalQueryRunner.java:57)\n" +
            "\tat org.apache.deltaspike.data.impl.tx.TransactionalQueryRunner$Proxy$_$$_WeldClientProxy.executeQuery(Unknown Source)\n" +
            "\tat org.apache.deltaspike.data.impl.handler.QueryHandler.process(QueryHandler.java:151)\n" +
            "\t... 78 more\n" +
            "Caused by: org.apache.deltaspike.data.api.QueryInvocationException: Failed calling Repository: [Repository=nl.infosupport.deltaspike.BookRepository,entity=nl.infosupport.deltaspike.Book,method=remove,exception=class java.lang.reflect.InvocationTargetException,message=null\n" +
            "\tat org.apache.deltaspike.data.impl.builder.DelegateQueryBuilder.invoke(DelegateQueryBuilder.java:138)\n" +
            "\tat org.apache.deltaspike.data.impl.builder.DelegateQueryBuilder.execute(DelegateQueryBuilder.java:60)\n" +
            "\t... 84 more\n" +
            "Caused by: java.lang.reflect.InvocationTargetException\n" +
            "\tat java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\n" +
            "\tat java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\n" +
            "\tat java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\n" +
            "\tat java.base/java.lang.reflect.Method.invoke(Method.java:566)\n" +
            "\tat org.apache.deltaspike.data.impl.builder.DelegateQueryBuilder.invoke(DelegateQueryBuilder.java:130)\n" +
            "\t... 85 more\n" +
            "Caused by: java.lang.IllegalArgumentException: Removing a detached instance nl.infosupport.deltaspike.Book#1\n" +
            "\tat org.hibernate.event.internal.DefaultDeleteEventListener.disallowDeletionOfDetached(DefaultDeleteEventListener.java:190)\n" +
            "\tat org.hibernate.event.internal.DefaultDeleteEventListener.performDetachedEntityDeletionCheck(DefaultDeleteEventListener.java:178)\n" +
            "\tat org.hibernate.event.internal.DefaultDeleteEventListener.onDelete(DefaultDeleteEventListener.java:105)\n" +
            "\tat org.hibernate.event.internal.DefaultDeleteEventListener.onDelete(DefaultDeleteEventListener.java:72)\n" +
            "\tat org.hibernate.event.service.internal.EventListenerGroupImpl.fireEventOnEachListener(EventListenerGroupImpl.java:107)\n" +
            "\tat org.hibernate.internal.SessionImpl.fireDelete(SessionImpl.java:940)\n" +
            "\tat org.hibernate.internal.SessionImpl.delete(SessionImpl.java:872)\n" +
            "\tat org.hibernate.internal.SessionImpl.remove(SessionImpl.java:3362)\n" +
            "\tat org.apache.deltaspike.data.impl.handler.EntityRepositoryHandler.remove(EntityRepositoryHandler.java:215)\n" +
            "\t... 90 more\n")
    void removeHitsAProblem(){
        //Arrange

        //Act
    }

    @Test
    @DisplayName("Can I Save a new Book, it shouldn't have a detached entity problem")
    void saveAnEntity(){
        Weld weld = new Weld();

        try(WeldContainer weldContainer = weld.initialize();){
            RegisterBookService registerBookService = weldContainer.select(RegisterBookService.class).get();
            registerBookService.save();
        }
    }

    @Test
    @DisplayName("Can I Save a new Book, it shouldn't have a detached entity problem")
    void countBooks(){
        Weld weld = new Weld();

        try(WeldContainer weldContainer = weld.initialize();){
            RegisterBookService registerBookService = weldContainer.select(RegisterBookService.class).get();
            Long booksCount = registerBookService.countBooks();
            assertThat(booksCount).isEqualTo(2L);
        }
    }
}
