import java.lang.*;
import javax.swing.JOptionPane;
import javax.swing.JFrame;
import java.util.Timer;
import java.util.TimerTask;

class ReconSuic {
  public static void main(String[] args){
    Timer timer = new Timer();
    JFrame frame = new JFrame();

    timer.scheduleAtFixedRate(new TimerTask(){
    	@Override
	public void run(){
		JOptionPane.showMessageDialog(frame,
				"Please reconsider suicide",
				"Really reconsider please",
				JOptionPane.ERROR_MESSAGE);
	}
    }, 1000, 2*60*1000);
  }
}
