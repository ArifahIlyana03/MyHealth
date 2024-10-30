//import 
package org.appinventor;
import com.google.appinventor.components.runtime.HandlesEventDispatching;
import com.google.appinventor.components.runtime.EventDispatcher;
import com.google.appinventor.components.runtime.Form;
import com.google.appinventor.components.runtime.Component;
import com.google.appinventor.components.runtime.Image;
import com.google.appinventor.components.runtime.Button;
import android.content.Intent;
//logo and button design
class Screen1 extends Form implements HandlesEventDispatching {
  private Image Image1;
  private Button Button1;
  protected void $define() {
    this.AlignHorizontal(3);
    this.AppName("ARIFAH");
    this.Title("Screen1");
    Image1 = new Image(this);
    Image1.Height(-1060);
    Image1.Picture("Logo2.png");
    Button1 = new Button(this);
    Button1.BackgroundColor(0xFF0000FF);
    Button1.FontBold(true);
    Button1.Shape(1);
    Button1.Text("Click to start !");
    Button1.TextColor(0xFFFFFFFF);
    EventDispatcher.registerEventForDelegation(this, "ClickEvent", "Click" );
  }
  //code for button 
  public boolean dispatchEvent(Component component, String componentName, String eventName, Object[] params){
    if( component.equals(Button1) && eventName.equals("Click") ){
      Button1Click();
      return true;
    }
    return false;
  }
  public void Button1Click(){
    startActivity(new Intent().setClass(this, Screen2.class));
  }
}
