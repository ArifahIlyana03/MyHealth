//import
package org.appinventor;
import com.google.appinventor.components.runtime.HandlesEventDispatching;
import com.google.appinventor.components.runtime.EventDispatcher;
import com.google.appinventor.components.runtime.Form;
import com.google.appinventor.components.runtime.Component;
import com.google.appinventor.components.runtime.Button;
import com.google.appinventor.components.runtime.VerticalScrollArrangement;
import com.google.appinventor.components.runtime.Label;
import com.google.appinventor.components.runtime.HorizontalArrangement;
import com.google.appinventor.components.runtime.Image;
import android.content.Intent;
//design for menu
class Screen2 extends Form implements HandlesEventDispatching {
  private Button ButtonBackToPageOne;
  private VerticalScrollArrangement VerticalScrollArrangement1;
  private Label Spaces1;
  private Label Spaces2;
  private Label Spaces3;
  private HorizontalArrangement HorizontalArrangement1;
  private Image Image1;
  private Button ButtonToStepCounterPage;
  private Label Label1;
  private HorizontalArrangement HorizontalArrangement2;
  private Image Image2;
  private Button ButtonToWaterIntakePage;
  protected void $define() {
    this.AppName("ARIFAH");
    this.BackgroundImage("backgroundtextwaterintake.png");
    this.Title("Menu");
    ButtonBackToPageOne = new Button(this);
    ButtonBackToPageOne.Height(-1010);
    ButtonBackToPageOne.Width(-1017);
    ButtonBackToPageOne.Image("backmenuremovebg.png");
    VerticalScrollArrangement1 = new VerticalScrollArrangement(this);
    VerticalScrollArrangement1.AlignHorizontal(2);
    VerticalScrollArrangement1.BackgroundColor(0x00FFFFFF);
    VerticalScrollArrangement1.Height(-1100);
    VerticalScrollArrangement1.Width(-1070);
    Spaces1 = new Label(VerticalScrollArrangement1);
    Spaces2 = new Label(VerticalScrollArrangement1);
    Spaces3 = new Label(VerticalScrollArrangement1);
    HorizontalArrangement1 = new HorizontalArrangement(VerticalScrollArrangement1);
    Image1 = new Image(HorizontalArrangement1);
    Image1.Height(-1020);
    Image1.Width(-1040);
    Image1.Picture("stepsimageremovebg.png");
    ButtonToStepCounterPage = new Button(HorizontalArrangement1);
    ButtonToStepCounterPage.BackgroundColor(0xFF0000FF);
    ButtonToStepCounterPage.FontBold(true);
    ButtonToStepCounterPage.Shape(1);
    ButtonToStepCounterPage.Text("Steps Counter");
    ButtonToStepCounterPage.TextColor(0xFFFFFFFF);
    Label1 = new Label(VerticalScrollArrangement1);
    HorizontalArrangement2 = new HorizontalArrangement(VerticalScrollArrangement1);
    HorizontalArrangement2.AlignHorizontal(3);
    HorizontalArrangement2.AlignVertical(2);
    Image2 = new Image(HorizontalArrangement2);
    Image2.Height(-1020);
    Image2.Width(-1040);
    Image2.Picture("waterbottle.png");
    ButtonToWaterIntakePage = new Button(HorizontalArrangement2);
    ButtonToWaterIntakePage.BackgroundColor(0xFF0000FF);
    ButtonToWaterIntakePage.FontBold(true);
    ButtonToWaterIntakePage.Shape(1);
    ButtonToWaterIntakePage.Text("Water intake");
    ButtonToWaterIntakePage.TextColor(0xFFFFFFFF);
    EventDispatcher.registerEventForDelegation(this, "ClickEvent", "Click" );
  }
  //button back to first page
  public boolean dispatchEvent(Component component, String componentName, String eventName, Object[] params){
    if( component.equals(ButtonBackToPageOne) && eventName.equals("Click") ){
      ButtonBackToPageOneClick();
      return true;
    }
    //button to step counter page
    if( component.equals(ButtonToStepCounterPage) && eventName.equals("Click") ){
      ButtonToStepCounterPageClick();
      return true;
    }
    //button to track water intake page
    if( component.equals(ButtonToWaterIntakePage) && eventName.equals("Click") ){
      ButtonToWaterIntakePageClick();
      return true;
    }
    return false;
  }
  public void ButtonBackToPageOneClick(){
    startActivity(new Intent().setClass(this, Screen1.class));
  }
  public void ButtonToStepCounterPageClick(){
    startActivity(new Intent().setClass(this, Screen3.class));
  }
  public void ButtonToWaterIntakePageClick(){
    startActivity(new Intent().setClass(this, Screen4.class));
  }
}
