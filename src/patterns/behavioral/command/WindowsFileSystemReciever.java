package patterns.behavioral.command;

public class WindowsFileSystemReciever implements FileSystemReceiver {

    @Override
    public void openFile() {
        System.out.println("Opening file in win");
    }

    @Override
    public void writeFile() {
        System.out.println("Writing file in win");
    }

    @Override
    public void closeFile() {
        System.out.println("Closing file in win");
    }

}
