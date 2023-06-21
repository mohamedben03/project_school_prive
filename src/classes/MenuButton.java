
package classes;

import java.awt.Component;
import java.awt.MenuItem;
import javafx.animation.Animation;
import static jdk.nashorn.internal.parser.TokenType.IF;
import net.miginfocom.swing.MigLayout;
import org.jdesktop.animation.timing.Animator;
import org.jdesktop.animation.timing.TimingTargetAdapter;


   public class MenuButton {
    public static  void showMenu(Component component,MenuItem item,MigLayout layoutla, boolean show){

int height =component.getPreferredSize().height;
        Animator anmator =new Animator(300,new TimingTargetAdapter(){
    @Override
    public void timingEvent(float fraction) {
        float f =show?fraction:1f-fraction;
        layoutla.setComponentConstraints(component, "h"+height*f + "!");
        component.revalidate();
        
        
    }
        });
        anmator.setResolution(0);
        anmator.setAcceleration(.5f);
        anmator.setDeceleration(.5f);
        anmator.start();
}
    

    
}
