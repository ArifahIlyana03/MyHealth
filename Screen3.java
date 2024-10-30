//import
package org.appinventor;
import com.google.appinventor.components.runtime.HandlesEventDispatching;
import com.google.appinventor.components.runtime.EventDispatcher;
import com.google.appinventor.components.runtime.Form;
import com.google.appinventor.components.runtime.Component;
import com.google.appinventor.components.runtime.Image;
import com.google.appinventor.components.runtime.HorizontalScrollArrangement;
import com.google.appinventor.components.runtime.Label;
import com.google.appinventor.components.runtime.Button;
import com.google.appinventor.components.runtime.Pedometer;
import android.content.Intent;
//design for counter step page
class Screen3 extends Form implements HandlesEventDispatching {
  private Image Image1;
  private HorizontalScrollArrangement HorizontalScrollArrangement1;
  private Label Label1;
  private Label Label2;
  private HorizontalScrollArrangement HorizontalScrollArrangement2;
  private Label Label4;
  private Label Label3;
  private Label Label5;
  private Button StartButton;
  private Label Label6;
  private Button StopButton;
  private Label Label7;
  private Button ResetButton;
  private Label Label8;
  private Button ButtonBackToMenu;
  private Pedometer Pedometer1;
  protected void $define() {
    this.AlignHorizontal(3);
    this.AppName("ARIFAH");
    this.BackgroundImage("backgroundtextwaterintake.png");
    this.Title("Step Counter");
    Image1 = new Image(this);
    Image1.Height(-1025);
    Image1.Width(-1030);
    Image1.Picture("stepsimageremovebg.png");
    HorizontalScrollArrangement1 = new HorizontalScrollArrangement(this);
    HorizontalScrollArrangement1.AlignVertical(2);
    HorizontalScrollArrangement1.BackgroundColor(0x00FFFFFF);
    HorizontalScrollArrangement1.Width(-1070);
    Label1 = new Label(HorizontalScrollArrangement1);
    Label1.FontSize(25);
    Label1.Text("Step Count:");
    Label2 = new Label(HorizontalScrollArrangement1);
    Label2.FontSize(25);
    Label2.Text("0");
    HorizontalScrollArrangement2 = new HorizontalScrollArrangement(this);
    HorizontalScrollArrangement2.AlignVertical(2);
    HorizontalScrollArrangement2.BackgroundColor(0x00FFFFFF);
    HorizontalScrollArrangement2.Width(-1070);
    Label4 = new Label(HorizontalScrollArrangement2);
    Label4.FontSize(25);
    Label4.Text("Calorie Burned:");
    Label3 = new Label(HorizontalScrollArrangement2);
    Label3.FontSize(25);
    Label3.Text("0");
    Label5 = new Label(this);
    StartButton = new Button(this);
    StartButton.BackgroundColor(0xFF00FF00);
    StartButton.FontSize(15);
    StartButton.Width(-1050);
    StartButton.Shape(1);
    StartButton.Text("Start");
    Label6 = new Label(this);
    StopButton = new Button(this);
    StopButton.BackgroundColor(0xFFFF0000);
    StopButton.FontSize(15);
    StopButton.Width(-1050);
    StopButton.Shape(1);
    StopButton.Text("Stop");
    StopButton.TextColor(0xFFFFFFFF);
    Label7 = new Label(this);
    ResetButton = new Button(this);
    ResetButton.BackgroundColor(0xFFFFC800);
    ResetButton.FontSize(15);
    ResetButton.Width(-1050);
    ResetButton.Shape(1);
    ResetButton.Text("Reset");
    Label8 = new Label(this);
    ButtonBackToMenu = new Button(this);
    ButtonBackToMenu.BackgroundColor(0xFF0000FF);
    ButtonBackToMenu.Shape(1);
    ButtonBackToMenu.Text("Back");
    ButtonBackToMenu.TextColor(0xFFFFFFFF);
    Pedometer1 = new Pedometer(this);
    EventDispatcher.registerEventForDelegation(this, "WalkStepEvent", "WalkStep" );
    EventDispatcher.registerEventForDelegation(this, "ClickEvent", "Click" );
  }
  //code for step counter page
  public boolean dispatchEvent(Component component, String componentName, String eventName, Object[] params){
    if( component.equals(Pedometer1) && eventName.equals("WalkStep") ){
      Pedometer1WalkStep((int)params[0], ((Float)params[1]).intValue());
      return true;
    }
    if( component.equals(StartButton) && eventName.equals("Click") ){
      StartButtonClick();
      return true;
    }
    if( component.equals(ButtonBackToMenu) && eventName.equals("Click") ){
      ButtonBackToMenuClick();
      return true;
    }
    if( component.equals(StopButton) && eventName.equals("Click") ){
      StopButtonClick();
      return true;
    }
    if( component.equals(ResetButton) && eventName.equals("Click") ){
      ResetButtonClick();
      return true;
    }
    return false;
  }
  //code for pedometer walk step sensor
  public void Pedometer1WalkStep(int walkSteps, float distance){
    Label2.Text(walkSteps);
    Label3.Text(String.valueOf(String.valueOf(String.valueOf((0.045 * Integer.valueOf(Label2.Text()))))));
  }
  public void StartButtonClick(){
    Pedometer1.Start();
  }
  //button back to menu code
  public void ButtonBackToMenuClick(){
    startActivity(new Intent().setClass(this, Screen2.class));
  }
  //button to stop step counter
  public void StopButtonClick(){
  }
  //button to reset step counter
  public void ResetButtonClick(){
  }
}
