package patterns.behavioral.command;

public class FileSystemRecieverUtil {

    public static FileSystemReceiver getUnderlaingFileSystem(){
        String osName = System.getProperty("os.name");
        System.out.println("Underlying OS is: " + osName);
        if(osName.contains("Windows")){
            return new WindowsFileSystemReciever();}
        else if (osName.contains("Mac")){
            return new MacFileSystemReceiver();
        } else {
            return new WindowsFileSystemReciever();
        }
        }

    }


