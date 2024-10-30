//import
package org.appinventor;
import com.google.appinventor.components.runtime.HandlesEventDispatching;
import com.google.appinventor.components.runtime.EventDispatcher;
import com.google.appinventor.components.runtime.Form;
import com.google.appinventor.components.runtime.Component;
import com.google.appinventor.components.runtime.VerticalScrollArrangement;
import com.google.appinventor.components.runtime.Label;
import com.google.appinventor.components.runtime.Image;
import com.google.appinventor.components.runtime.VerticalArrangement;
import com.google.appinventor.components.runtime.CheckBox;
import com.google.appinventor.components.runtime.Button;
import android.content.Intent;
//design for water intake page
class Screen4 extends Form implements HandlesEventDispatching {
  private VerticalScrollArrangement VerticalScrollArrangement1;
  private Label Spaces1;
  private Label Spaces2;
  private Label Spaces3;
  private Label Spaces4;
  private Image Image1;
  private Label Label5;
  private VerticalArrangement VerticalArrangement1;
  private CheckBox levelfourwaterintake;
  private CheckBox levelthreewaterintake;
  private CheckBox leveltwowaterintake;
  private CheckBox levelonewaterintake;
  private Label Label6;
  private Button Button1;
  protected void $define() {
    this.AlignHorizontal(3);
    this.AlignVertical(2);
    this.AppName("ARIFAH");
    this.BackgroundImage("backgroundtextwaterintake.png");
    this.Title("Water intake");
    VerticalScrollArrangement1 = new VerticalScrollArrangement(this);
    VerticalScrollArrangement1.AlignHorizontal(3);
    VerticalScrollArrangement1.BackgroundColor(0x00FFFFFF);
    VerticalScrollArrangement1.Height(LENGTH_FILL_PARENT);
    VerticalScrollArrangement1.Width(LENGTH_FILL_PARENT);
    Spaces1 = new Label(VerticalScrollArrangement1);
    Spaces2 = new Label(VerticalScrollArrangement1);
    Spaces3 = new Label(VerticalScrollArrangement1);
    Spaces4 = new Label(VerticalScrollArrangement1);
    Image1 = new Image(VerticalScrollArrangement1);
    Image1.Height(-1040);
    Image1.Width(-1090);
    Image1.Picture("waterbottle.png");
    Image1.ScalePictureToFit(true);
    Label5 = new Label(VerticalScrollArrangement1);
    Label5.FontSize(20);
    Label5.Text("Track your water intake!");
    VerticalArrangement1 = new VerticalArrangement(VerticalScrollArrangement1);
    levelfourwaterintake = new CheckBox(VerticalArrangement1);
    levelfourwaterintake.Text("1000 ml");
    levelthreewaterintake = new CheckBox(VerticalArrangement1);
    levelthreewaterintake.Text("750 ml");
    leveltwowaterintake = new CheckBox(VerticalArrangement1);
    leveltwowaterintake.Text("500 ml");
    levelonewaterintake = new CheckBox(VerticalArrangement1);
    levelonewaterintake.Text("250 ml");
    Label6 = new Label(VerticalScrollArrangement1);
    Button1 = new Button(VerticalScrollArrangement1);
    Button1.BackgroundColor(0xFF0000FF);
    Button1.FontBold(true);
    Button1.Shape(1);
    Button1.Text("Back");
    Button1.TextColor(0xFFFFFFFF);
    EventDispatcher.registerEventForDelegation(this, "InitializeEvent", "Initialize" );
    EventDispatcher.registerEventForDelegation(this, "ChangedEvent", "Changed" );
    EventDispatcher.registerEventForDelegation(this, "ClickEvent", "Click" );
  }
  //code for water intake
  public boolean dispatchEvent(Component component, String componentName, String eventName, Object[] params){
    if( component.equals(this) && eventName.equals("Initialize") ){
      thisInitialize();
      return true;
    }
    //code checkbox in waterintake 250ml
    if( component.equals(levelonewaterintake) && eventName.equals("Changed") ){
      levelonewaterintakeChanged();
      return true;
    }
    //code checkbox in waterintake 500ml
    if( component.equals(leveltwowaterintake) && eventName.equals("Changed") ){
      leveltwowaterintakeChanged();
      return true;
    }
    //code checkbox in waterintake 750ml
    if( component.equals(levelthreewaterintake) && eventName.equals("Changed") ){
      levelthreewaterintakeChanged();
      return true;
    }
    //code checkbox in waterintake 1000ml
    if( component.equals(levelfourwaterintake) && eventName.equals("Changed") ){
      levelfourwaterintakeChanged();
      return true;
    }
    if( component.equals(Button1) && eventName.equals("Click") ){
      Button1Click();
      return true;
    }
    return false;
  }
//code text for each level water intake
  public void thisInitialize(){
    Label5.Text("Track water intake !");
  }
  public void levelonewaterintakeChanged(){
    Label5.Text("Come on, You can do it!  >_> " + levelonewaterintake.Text());
  }
  public void leveltwowaterintakeChanged(){
    Label5.Text("Don't give up! >o<  " + leveltwowaterintake.Text());
  }
  public void levelthreewaterintakeChanged(){
    Label5.Text("You almost there!  (^o^)   " + levelthreewaterintake.Text());
  }
  public void levelfourwaterintakeChanged(){
    Label5.Text("Congratulations!!  *\(^o^)/*  " + levelfourwaterintake.Text());
  }
  //code to menu page
  public void Button1Click(){
    startActivity(new Intent().setClass(this, Screen2.class));
  }
}
