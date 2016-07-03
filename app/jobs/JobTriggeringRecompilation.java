package jobs;

import play.Play;
import play.jobs.Every;
import play.jobs.Job;
import play.jobs.OnApplicationStart;

@Every("1h")
@OnApplicationStart(async = true)
public class JobTriggeringRecompilation extends Job {
  @Override
  public void doJob() throws Exception {
    long start = System.currentTimeMillis();
    for (int i = 0; i <= 100000; i++) {
      isClassExist("controllers.Hello$BeanInfo");
      if (i % 1000 == 0)
        System.out.println(" " + i + ") " + (System.currentTimeMillis() - start) + " ms.");
    }
  }
  
  private static boolean isClassExist(String className) {
    try {
      Play.classloader.loadClass(className);
      return true;
    }
    catch (ClassNotFoundException ignore) {
      return false;
    } 
  }
}
