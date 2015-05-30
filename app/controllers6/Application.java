package controllers6;

import play.mvc.Controller;


public class Application extends Controller {

  public static void index() {
    render();
  }

  public static void hello() {
    render();
  }
  
  static String name() {
    return "Карабас!";
  }
}