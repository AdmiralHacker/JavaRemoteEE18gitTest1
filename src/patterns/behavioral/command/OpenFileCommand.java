package patterns.behavioral.command;

public class OpenFileCommand implements Command {

    private FileSystemReceiver fileSystemReceiver;

    public OpenFileCommand(FileSystemReceiver fs) {
        fileSystemReceiver = fs;             //this. mozno ispolzovat no on nuzen esli nazvanija sovpadajut
    }


    @Override
    public void execute() {
        fileSystemReceiver.openFile();

    }
}
