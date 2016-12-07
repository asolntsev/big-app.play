package controllers;

import models.Pet;
import play.mvc.Controller;

public class Application extends Controller {

  public static void index() {
    render();
  }

  public static void hello() {
    render();
  }
  
  public static void submit() {
    for (int i = 0; i < 100; i++) {
      new Pet("коза " + i).save();
    }
    redirect("Application.index");
  }
  
  public static void submit2() {
    for (int i = 0; i < 100; i++) {
      Pet pet = new Pet("коза " + i).save();
//      new PetStatus(pet, "newborn").save();
//      new PetStatus(pet, "married").save();
//      new PetStatus(pet, "died").save();
    }
    redirect("Application.index");
  }
  
  public static String name() {
    return "Карабас!";
  }
}