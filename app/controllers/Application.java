package controllers;

import play.mvc.Controller;
import play.mvc.Router;


public class Application extends Controller {
  static {
    Router.addRoute(0, "GET", "/", "Web.serveContent", null);
    for (int i = 0; i < 100; i++) {
      Router.addRoute("GET", "/hello/{action}.*", "Hello.{action}", null);
      Router.addRoute("GET", "/hello/{action}/?.*", "Hello.{action}", null);
      Router.addRoute("GET", "/hello/{action}/", "Hello.{action}", null);
    }
  }

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