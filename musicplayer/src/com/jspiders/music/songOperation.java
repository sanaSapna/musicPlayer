package com.jspiders.music;
import java.util.ArrayList;
import java.util.Scanner;

public class songOperation {
	ArrayList<Song> music=new ArrayList<Song>();
	Scanner sc=new Scanner(System.in);
	boolean list=false;

    public void addSongs() {
	System.out.println("Enter number of Songs to add:");
	int no =sc.nextInt();
	for (int i = 0; i < no ; i++) {
	System.out.println("Enter song Name :");

	String s=sc.next();
	music.add(i,new Song());
	music.get(i),setId(i+1);
	music.get(i).setSongName(s);
	}
  }
    public void displayListOfSongs() {
    	if (music.isEmpty()==true) {
		//System.out.println("No song in the List.");
    		throw new NullPointerException();
		} 
    	else {
         System.out.println("music");
		}
    }
    	public void removeSong() {
    	try {
			this.displayListOfSongs();
			System.out.println("remove song no.");
    	int j=sc.nextInt();
    	music.remove(j-1);
    	this.displayListOfSongs();
    	}
    	catch (Exception e) {
			// TODO: handle exception
    		System.out.println("No song in the list .Add some song first.");
		  }
    	}
    	public void chooseSongPlay(){
    		try {
    			this.displayListOfSongs();
                System.out.println("enter song number :");
    			int no=sc.nextInt();
    			try {
    			System.out.println(music.get(no-1).getSongName()+"song played ");	
    			}
    			catch(IndexOutOfBoundsException e){
    			System.out.println("No Songs found ");    	
    			}
    		}
    		catch(Exception e) {
    			System.out.println("No songs in List.Add some songs first ");
    		}
    	}
    		public void PlayAllSong(){
    			for(int i=0;i<music.size();i++) {
    			System.out.println(music.get(i).getSongName()+"song played ");
    			}
    		}
    		public void PlayRandom() {
    			double a=(Math.random()*(music.size()-0+1))+0;
    			System.out.println(music.get((int)a).getSongName()+"song played");
    		}
    		public void update() {
    			System.out.println(music);
    			System.out.println("choose song id no ");
    			int n=sc.nextInt();
    			System.out.println("1.id /n 2.Song name /n 3.movie name /n 4.length /n back");
    			int key=sc.nextInt();
    			switch(key) {
    			case 1:
    				System.out.println("enter new id ");
    				music.get(n-1).setId(sc.nextInt());
    				break;
    			case 2:
    				System.out.println("enter song by song name");
    				music.get(n-1).setSongName(sc.next());
    				break;
    			case 3:
    				System.out.println("enter song by movie name ");
    				music.get(n-1).setMovieName(sc.next());
    				break;
    			case 4:
    				System.out.println("enter song by song length");
    				music.get(n-1).setLength(sc.nextDouble());
    				break;
    			case 5:
    				break;
    			}
    		}
    	
      }
    

