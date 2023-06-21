
package classes;

import javax.swing.JButton;


public class MenuItem  extends JButton{
  
    private int index;
    private boolean submenuAble;
       private int  submenuIndex;
       private int length;
         public MenuItem(String name , int index, boolean submenuAble){super(name);
         this.index=index;
         this.submenuAble=submenuAble;
         }
         public void initsubMenu( int submenuIndex,int length){
         this.submenuIndex=submenuIndex;
         this.length=length;
         }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public boolean isSubmenuAble() {
        return submenuAble;
    }

    public void setSubmenuAble(boolean submenuAble) {
        this.submenuAble = submenuAble;
    }

    public int getSubmenuIndex() {
        return submenuIndex;
    }

    public void setSubmenuIndex(int submenuIndex) {
        this.submenuIndex = submenuIndex;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }
    
}
