package jobs;

import play.Play;
import play.jobs.Every;
import play.jobs.Job;
import play.jobs.OnApplicationStart;
import play.templates.FastTags;

//@Every("1s")
//@OnApplicationStart(async = true)
public class JobAskingClasses extends Job {
  @Override
  public void doJob() throws Exception {
    System.out.println("start");
    for (int i = 0; i < 1000; i++) {
      try {
        Play.classloader.getAssignableClasses(FastTags.class);
      }
      catch (Exception e) {
        e.printStackTrace();
      }
    }
    System.out.println("done");
  }
}
