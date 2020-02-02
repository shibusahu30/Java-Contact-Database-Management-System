
import java.awt.Image;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.filechooser.FileNameExtensionFilter;

public class myfunc {
    
    public ImageIcon resizePic(String picPath,byte[] BLOBpic ,int wdth,int hgt){
        ImageIcon myImage;
        if(picPath!=null){
            myImage=new ImageIcon(picPath);
        }
        else{
            myImage=new ImageIcon(BLOBpic);
        }
        Image img=myImage.getImage().getScaledInstance(wdth,hgt,Image.SCALE_SMOOTH);
        ImageIcon myPicture=new ImageIcon(img);
        return myPicture;
    }
    
    public String browseImage(JLabel lb1){
        String path=null;
        JFileChooser filec=new JFileChooser();
        filec.setCurrentDirectory(new File(System.getProperty("user.home")));
        //file extension
        FileNameExtensionFilter fileFilter=new FileNameExtensionFilter("*.Images","jpg","png","gif");
        filec.addChoosableFileFilter(fileFilter);
        int fileState=filec.showSaveDialog(null);
        //if user delect a file
        if(fileState==JFileChooser.APPROVE_OPTION){
            File selectedFile=filec.getSelectedFile();
            path=selectedFile.getAbsolutePath();
            //imagePth=path;
            // image display
            lb1.setIcon(resizePic(path,null,lb1.getWidth(),lb1.getHeight()));
            //jLabelPic.setIcon(new ImageIcon(path));
            
        }
        else if(fileState==JFileChooser.CANCEL_OPTION){
            System.out.println("No File Selected");
        }   
        return path;
    }
}
