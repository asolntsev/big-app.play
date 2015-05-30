package controllers;

import play.mvc.Controller;


public class Application extends Controller {

  public static void index() {
    render();
  }

  public static void hello() {
    render();
  }
  
  public static String name() {
    return "Карабас!";
  }
}