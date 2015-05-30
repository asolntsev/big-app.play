package plugins;

import controllers.Hello111111111111111111111111;
import controllers7.Hello1111111111111111111111111;
import play.PlayPlugin;
import play.classloading.ApplicationClasses;
import play.mvc.Http;

public class HelloGoodbyePlugin extends PlayPlugin {
  @Override
  public void onApplicationStart() {
    System.out.println("********* Hello Play! ************** " + Hello111111111111111111111111.debug());
  }

  @Override
  public void onApplicationStop() {
    System.out.println("********* Goodbye Play! ************** " + Hello1111111111111111111111111.debug());
  }

  @Override
  public void beforeInvocation() {
    System.out.println(Http.Request.current().url);
  }

  @Override
  public void enhance(ApplicationClasses.ApplicationClass applicationClass) throws Exception {
    super.enhance(applicationClass);
  }
}
