package collections.discs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class DVDInfo implements Comparable<DVDInfo> {
	String title;
	String genre;
	String leadActor;

	DVDInfo(String t, String g, String a) {
		title = t;
		genre = g;
		leadActor = a;
	}

	public int compareTo(DVDInfo d) {
		return title.compareTo(d.getTitle());
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getLeadActor() {
		return leadActor;
	}

	public void setLeadActor(String leadActor) {
		this.leadActor = leadActor;
	}

	public String toString() {
		return title + " " + genre + " " + leadActor + "\n";
	}

	public static void main(String[] args) {
		String s = "Donnie Darko/sci-fi/Gyllenhall, Jake		Raiders of the Lost Ark/action/Ford, Harrison		2001/sci-fi/??		Caddy Shack/comedy/Murray, Bill		Star Wars/sci-fi/Ford, Harrison		Lost in Translation/comedy/Murray, Bill		Patriot Games/action/Ford, Harrison";
		ArrayList<DVDInfo> dvdList = new ArrayList<DVDInfo>();
		for (String dvd : s.split("		")) {
			String[] data = dvd.split("/");
			dvdList.add(new DVDInfo(data[0], data[1], data[2]));
		}
		DVDInfo[] dvdsPrimitives = dvdList
				.toArray(new DVDInfo[dvdList.size()]);
		// adds the file data to the ArrayList
		System.out.println(dvdList);
		Collections.sort(dvdList);
		System.out.println("sorted by title...........");
		System.out.println(dvdList);
		System.out.println("sorted by genre...........");
		Collections.sort(dvdList, new GenreSort());
		System.out.println(dvdList);
		Arrays.sort(dvdsPrimitives, new GenreSort());
		System.out.println("sorted obj arr by genre...........");
		System.out.println(dvdList);
	}
}
