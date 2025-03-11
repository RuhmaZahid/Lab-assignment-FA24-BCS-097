public class Book{
	private String Title;
	private String Issn;
	Date publicationDate;
	Person author;


	public Book(String title, String Issn, Date publicationDate, Person author) {
        this.title = title;
        this.issn = issn;
        this.publicationDate = publicationDate;
        this.author = author;
    	}

	 public Book(Book other) {
        this(other.title, other.issn, other.publicationDate, other.author);
    	}



	void showBookDetails(){
	System.out.println("Title: " + title + ", ISSN: " + issn);
        System.out.print("Publication Date: ");
        publicationDate.showDate();
	}

	public String getTitle() {
        return title;
    	}

    	public void setTitle(String title) {
        this.title = title;
   	}

   	public String getIssn() {
        return issn;
    	}

   	public void setIssn(String issn) {
        this.issn = issn;
    	}



}