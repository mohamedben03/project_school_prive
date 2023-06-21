
package classes;

import javax.swing.JComponent;
import net.miginfocom.swing.MigLayout;


public class menu1 extends JComponent{
    
    private MigLayout layout;
    private String[][] menuItems=new String[][]{
        {"dachbord"},{"email","reed","School"}
    };
    public  menu1(){
    }
    private void ini(){
    
    layout =new MigLayout(" wrap 1,fillx,gapy 0,inset 2","fill");
        setLayout(layout);
        for(int i=0;i<menuItems.length;i++){
            addMenu(menuItems[i][0], i);
        }
    
    }
    private void addMenu (String menuNane, int index){
    int length=menuItems[index].length;
    MenuItem item =new MenuItem(menuNane, index, length>1);
    add(item);
    revalidate();repaint();
            }
    
    
}
