package oop;

public class Book {

    //fields
    public String title;            //public fields
    public String author;
    private int numberOfPages;      //private field



    //Methods

    public void setNumberOfPages(int numberOfPages){
        if(isNumberOfPagesCorrect(numberOfPages)){
            this.numberOfPages=numberOfPages;

        } else {
            System.out.println("The provided nums of pages is incorrect " + numberOfPages);
        }
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    private boolean isNumberOfPagesCorrect(int numberOfPages){
        return numberOfPages >10;
    }

    public void printBookInfo(){
        System.out.println("Title " + title);
        System.out.println("Author "+ author);
        System.out.println("Nums of Pages "+ numberOfPages);
    }


}
