package com.jspiders.music;

public class Song {
int id; 
String songName;
String singerName;
String movieName;
double length;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSongName() {
		return songName;
	}
	public void setSongName(String songName) {
		this.songName = songName;
	}
	public String getSingerName() {
		return singerName;
	}
	public void setSingerName(String singerName) {
		this.singerName = singerName;
	}
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Song [id="+id+",songName="+songName+",singerName="+singerName+",movieName="+movieName+",length="+length+"]";
	}
	
 }
	

