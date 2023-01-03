package assignment2;
abstract class Item{
private int idNum;
private String title;
private int numCopies;
public Item(){
idNum =0;
title = " ";
numCopies = 0;
}
public Item(int idNum, String title, int numCopies){
idNum = idNum;
title = title;
numCopies = numCopies;
}
public int setidNum(int id){
idNum = id;
return id;
}
public String setTitle(String str){
title = str;
return str;
}
public int setNumCopies(int n){
numCopies = n;
return n;
}
public int getidNum(){
return idNum;
}
public String getTitle(){
return title;
}
public int getCopies(){
return numCopies;
}
public void checkIn(){
numCopies = numCopies + 1;
}
public void checkOut(){
numCopies = numCopies - 1;
}
public void addItem(int idNum, String str, int n){
setidNum(idNum);
setTitle(str);
setNumCopies(n);
}
public String toString(){
return "ID: " +idNum+ " Title: " +title+ " Number of Copies: " +numCopies;
}
public void print(){
System.out.println("Title: " +title);
System.out.println("ID: " +idNum);
System.out.println("Number of copies: " +numCopies);
}
public boolean equals(Object obj){
if(obj == null)
return false;
Item otherItem = (Item) obj;
return idNum == otherItem.idNum && title == otherItem.title && numCopies
== otherItem.numCopies;
}
public void addItem(){
numCopies++;
}
}

public class Book extends WrittenItem{
public Book(){
super();
}
public Book(int id, String str, int n){
super(id, str, n);
}
public boolean equals(Object obj){
if(obj == null)
return false;
Book otherBook = (Book) obj;
return super.equals(otherBook);
}
public String toString(){
return super.toString();
}
public int getIdNum(){
return super.getIdNum();
}
public String getTitle(){
return super.getTitle();
}
public int getNumCopies(){
return super.getNumCopies();
}
public String getAuthor(){
return super.getAuthor();
}
public void print(){
System.out.println("Display info about a book: ");
super.print();
}
public void checkIn(){
super.checkIn();
}
public void checkOut(){
super.checkOut();
}
public void addItem(){
super.addItem();
}
}

class JournalPaper extends WrittenItem{
private int pubYear;
JournalPaper(){
super();

}
public JournalPaper(int idNum, String str, int n, String author, int y){
super(idNum, str, n,author,y);
pubYear=y;
}
public String toString(){
return super.toString()+" Year published: "+ pubYear;
}
public int getIdNum(){
return super.getIdNum();
}
public String title(){
return super.getTitle();
}
public int numCopies(){
return super.getNumCopies();
}
public String getAuthor(){
return super.getAuthor();
}
public int yearPub(){
return yearPub;
}
public void print(){
super.print();
System.out.println("Year published: "+ pubYear);
}
public void checkIn(){

}
public void checkOut(){

}
public void addItem(){
super.addItem();
}
}

abstract class MediaItem{
private int runTime;
class Video extends MediaItem{
private String directior;
private String genre;
private int year;
}
class CD extends MediaItem{
private String artist;
private String genre;
}
public boolean equals(Object obj){
if(obj == null)
return false;
MediaItem otherMediaItem = (MediaItem) obj;
return super.equals(otherMediaItem) && runTime == otherMediaItem.runTime;
}
}

abstract class WrittenItem extends Item{
private String author;
void setAuthor(String str){
author = str;
}
String getAuthor(){
return author;
}
public int getidNum(){
return super.getidNum();
}
public String getTitle(){
return super.getTitle();
}
public int getNumCopies(){
return super.getCopies();
}
public boolean equals(Object obj){
if(obj == null)
return false;
WrittenItem otherWrittenItem = (WrittenItem) obj;
return super.equals(otherWrittenItem) && author == otherWrittenItem.author;
}
}
