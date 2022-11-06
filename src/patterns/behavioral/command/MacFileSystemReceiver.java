package patterns.behavioral.command;

public class MacFileSystemReceiver implements FileSystemReceiver {
    @Override
    public void openFile() {
        System.out.println("Opening file in MacOs");
    }

    @Override
    public void writeFile() {
        System.out.println("Writing file in MacOS");
    }

    @Override
    public void closeFile() {
        System.out.println("Closing file in MacOS");
    }
}
