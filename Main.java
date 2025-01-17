import java.util.ArrayList;
import java.util.*;


class song{
    String songName;
    String artist;
   //date in DD-MM-YYYY
  
int date;
    int playCount;
    song(String songName,String artist,int date){
        this.songName = songName;
        this.artist = artist;
        this.date = date;
        this.playCount = 0;
    }
    //take date as DD-MM-YYYY
    void setDate(int date){
        this.date = date;
    }
    void setPlayCount(int playCount){
        this.playCount = playCount;
    }
    void display(){
        System.out.println("Song Name: "+songName);
        System.out.println("Artist: "+artist);
        System.out.println("Date: "+date);
        System.out.println("Play Count: "+playCount);
    }

}

class playSong{
    song s;
    playSong(song s){
        this.s = s;
    }
    void play(){
        s.playCount++;
    }
    void display(){
        s.display();
    }
    //take date as DD-MM-YYYY
    void setDate(int date){
        s.setDate(date);
    }
    void setPlayCount(int playCount){
        s.setPlayCount(playCount);
    }

}

class Top10Song{
    //using appropriate java collection
    //tpopp10 songs on basis of play count
    //these top10Songs will be updated on basis of play count
    ArrayList<song> top10Songs;
    Top10Song(){
        top10Songs = new ArrayList<song>();
    }
    void addSong(song s){
        if(top10Songs.size()<10){
            top10Songs.add(s);
        }
        else{
            int min = Integer.MAX_VALUE;
            int index = -1;
            for(int i=0;i<top10Songs.size();i++){
                if(top10Songs.get(i).playCount<min){
                    min = top10Songs.get(i).playCount;
                    index = i;
                }
            }
            if(s.playCount>min){
                top10Songs.remove(index);
                top10Songs.add(s);
            }
        }
    }
    //display top 10 songs
    void display(){
        for(int i=0;i<top10Songs.size();i++){
            System.out.println("Song "+(i+1));
            top10Songs.get(i).display();
        }
    }

  
}

class ArtistTop10Song{
    //using appropriate java collection
    //top10 songs of artist on basis of play count
    //these top10Songs will be updated on basis of play count
    //if the artist songs are less than 10 then add all songs of that artist

    HashMap<String,ArrayList<song>> artistTop10Songs;
    ArtistTop10Song(){
        artistTop10Songs = new HashMap<String,ArrayList<song>>();
    }
    void addSong(song s){
        if(artistTop10Songs.containsKey(s.artist)){
            ArrayList<song> songs = artistTop10Songs.get(s.artist);
            if(songs.size()<10){
                songs.add(s);
            }
            else{
                int min = Integer.MAX_VALUE;
                int index = -1;
                for(int i=0;i<songs.size();i++){
                    if(songs.get(i).playCount<min){
                        min = songs.get(i).playCount;
                        index = i;
                    }
                }
                if(s.playCount>min){
                    songs.remove(index);
                    songs.add(s);
                }
            }
        }
        else{
            ArrayList<song> songs = new ArrayList<song>();
            songs.add(s);
            artistTop10Songs.put(s.artist,songs);
        }
    }
    //display top 10 songs of artist if artist's song is less than 10 then display add songs of that artist
    void display(String artist){
        if(artistTop10Songs.containsKey(artist)){
            ArrayList<song> songs = artistTop10Songs.get(artist);
            for(int i=0;i<songs.size();i++){
                System.out.println("Song "+(i+1));
                songs.get(i).display();
            }
        }
        else{
            System.out.println("No songs of this artist");
        }
    }
  
}

class Top10SongDate{
    //using appropriate java collection
    //top10 songs on basis of date
    //these top10Songs will be updated on basis of date
    ArrayList<song> top10Songs;
    Top10SongDate(){
        top10Songs = new ArrayList<song>();
    }
    void addSong(song s){
        if(top10Songs.size()<10){
            top10Songs.add(s);
        }
        else{
            int min = Integer.MAX_VALUE;
            int index = -1;
            for(int i=0;i<top10Songs.size();i++){
                if(top10Songs.get(i).date<min){
                    min = top10Songs.get(i).date;
                    index = i;
                }
            }
            if(s.date>min){
                top10Songs.remove(index);
                top10Songs.add(s);
            }
        }
    }
    //display top 10 songs
    void display(){
        for(int i=0;i<top10Songs.size();i++){
            System.out.println("Song "+(i+1));
            top10Songs.get(i).display();
        }
    }

}

class SongPlayLess{
    //using appropriate java collection
    //songs which are played less than 5 times
    ArrayList<song> songPlayLess;
    SongPlayLess(){
        songPlayLess = new ArrayList<song>();
    }
    void addSong(song s){
        if(s.playCount<5){
            songPlayLess.add(s);
        }
    }
    //display songs which are played less than 5 times
    void display(){
        for(int i=0;i<songPlayLess.size();i++){
            System.out.println("Song "+(i+1));
            songPlayLess.get(i).display();
        }
    }

}
class Main{
    public static void main(String[] args){
        //add songs as per real artist  and song name and add todays date
        //add sidhu moosewala songs 
        //add arjit singh songs
        //add taylor swift songs
        //add justin bieber songs
        //add ed sheeran songs
        //add dua lipa songs
        //have to add 10 songs of each artist

       song s1 = new song("Warning Shots","Sidhu Moosewala",10);
         song s2 = new song("Legend","Sidhu Moosewala",10);
            song s3 = new song("Dhakka","Sidhu Moosewala",10);  
            song s4 = new song("Old Skool","Sidhu Moosewala",10);
            song s5 = new song("Bad","Sidhu Moosewala",10);
            song s6 = new song("Same Beef","Sidhu Moosewala",10);
            song s7 = new song("Ishq Da Uda Adaa","Sidhu Moosewala",10);
            song s8 = new song("Outlaw","Sidhu Moosewala",10);
            song s9 = new song("Warning Shots","Sidhu Moosewala",10);
            song s10 = new song("Warning Shots","Sidhu Moosewala",10);
            song s11 = new song("Warning Shots","Sidhu Moosewala",10);
            song s12 = new song("Warning Shots","Sidhu Moosewala",10);
            song s13 = new song("Warning Shots","Sidhu Moosewala",10);
            song s14 = new song("Warning Shots","Sidhu Moosewala",10);
            song s15 = new song("Warning Shots","Sidhu Moosewala",10);
            song s16 = new song("Warning Shots","Sidhu Moosewala",10);
            //add songs of arjit singh
            song s17 = new song("Tum Hi Ho","Arjit Singh",10);
            song s18 = new song("Raabta","Arjit Singh",10);
            song s19 = new song("Kabira","Arjit Singh",10);
            song s20 = new song("Channa Mereya","Arjit Singh",10);
            song s21 =new song("Tera Yaar Hoon Main","Arjit Singh",10);
            song s22 = new song("Tum Hi Ho","Arjit Singh",10);
            song s23 = new song("Tum Hi Ho","Arjit Singh",10);
            song s24 = new song("Tum Hi Ho","Arjit Singh",10);
            song s25 = new song("Tum Hi Ho","Arjit Singh",10);
            song s26 = new song("Tum Hi Ho","Arjit Singh",10);

            //add songs of taylor swift
            song s27 = new song("Love Story","Taylor Swift",10);
            song s28 = new song("You Belong With Me","Taylor Swift",10);
            song s29 = new song("Blank Space","Taylor Swift",10);
            song s30 = new song("Shake It Off","Taylor Swift",10);
            song s31 = new song("Bad Blood","Taylor Swift",10);
            song s32 = new song("Love Story","Taylor Swift",10);
            song s33 = new song("Love Story","Taylor Swift",10);
            song s34 = new song("Love Story","Taylor Swift",10);
            song s35 = new song("Love Story","Taylor Swift",10);
            song s36 = new song("Love Story","Taylor Swift",10);
             //add songs of justin bieber
            song s37 = new song("Baby","Justin Bieber",10);
            song s38 = new song("Sorry","Justin Bieber",10);
            song s39 = new song("Love Yourself","Justin Bieber",10);
            song s40 = new song("What Do You Mean?","Justin Bieber",10);
            
            //add songs of ed sheeran
            song s41 = new song("Shape of You","Ed Sheeran",10);
            song s42 = new song("Perfect","Ed Sheeran",10);
            song s43 = new song("Thinking Out Loud","Ed Sheeran",10);
            song s44 = new song("Photograph","Ed Sheeran",10);
            song s45 = new song("Shape of You","Ed Sheeran",10);
            song s46 = new song("Shape of You","Ed Sheeran",10);
            song s47 = new song("Shape of You","Ed Sheeran",10);
            song s48 = new song("Shape of You","Ed Sheeran",10);
            song s49 = new song("Shape of You","Ed Sheeran",10);
            song s50 = new song("Shape of You","Ed Sheeran",10);
            //add songs of dua lipa
            song s51 = new song("New Rules","Dua Lipa",10);
            song s52 = new song("Don't Start Now","Dua Lipa",10);
            song s53 = new song("Physical","Dua Lipa",10);
            song s54 = new song("Break My Heart","Dua Lipa",10);
            song s55 = new song("New Rules","Dua Lipa",10);
            song s56 = new song("New Rules","Dua Lipa",10);
            song s57 = new song("New Rules","Dua Lipa",10);
            song s58 = new song("New Rules","Dua Lipa",10);
            song s59 = new song("New Rules","Dua Lipa",10);
            song s60 = new song("New Rules","Dua Lipa",10);
            //add songs of dua lipa
            song s61 = new song("New Rules","Dua Lipa",10);
            song s62 = new song("Don't Start Now","Dua Lipa",10);
            song s63 = new song("Physical","Dua Lipa",10);
            song s64 = new song("Break My Heart","Dua Lipa",10);
            song s65 = new song("New Rules","Dua Lipa",10);
            song s66 = new song("New Rules","Dua Lipa",10);
            song s67 = new song("New Rules","Dua Lipa",10);
            song s68 = new song("New Rules","Dua Lipa",10);
            song s69 = new song("New Rules","Dua Lipa",10);
            song s70 = new song("New Rules","Dua Lipa",10);


            playSong ps1 = new playSong(s1);
            playSong ps2 = new playSong(s2);    
            //play song s2 5 times
            for(int i=0;i<5;i++){
                ps2.play();
            }
            playSong ps3 = new playSong(s3);
            //play this 10 times
            for(int i=0;i<10;i++){
                ps3.play();
            }
            playSong ps4 = new playSong(s4);
            //play this 3 times
            for(int i=0;i<3;i++){
                ps4.play();
            }

            playSong ps5 = new playSong(s5);
            //play this 7 times
            for(int i=0;i<7;i++){
                ps5.play();
            }
            playSong ps6 = new playSong(s6);

            playSong ps7 = new playSong(s7);
            //play this 2 times
            for(int i=0;i<2;i++){
                ps7.play();
            }
            playSong ps8 = new playSong(s8);
            //play this 4 times
            for(int i=0;i<4;i++){
                ps8.play();
            }
            playSong ps9 = new playSong(s9);
            //play this 6 times
            for(int i=0;i<6;i++){
                ps9.play();
            }
            playSong ps10 = new playSong(s10);
            //play this 8 times
            for(int i=0;i<8;i++){
                ps10.play();
            }
            playSong ps11 = new playSong(s11);
            //play this 9 times
            for(int i=0;i<9;i++){
                ps11.play();
            }
            playSong ps12 = new playSong(s12);
            //play this 10 times
            for(int i=0;i<10;i++){
                ps12.play();
            }

            //get top10songs on basis of play count
            Top10Song top10Song = new Top10Song();
            top10Song.addSong(s1);
            top10Song.addSong(s2);
            top10Song.addSong(s3);
            top10Song.addSong(s4);
            top10Song.addSong(s5);
            top10Song.addSong(s6);
            top10Song.addSong(s7);
            top10Song.addSong(s8);

            //display ArtistTop10Song
            ArtistTop10Song artistTop10Song = new ArtistTop10Song();
       //retirve the top10 songs of each artiest by using the playcount
            artistTop10Song.addSong(s1);
            artistTop10Song.addSong(s2);
            artistTop10Song.addSong(s3);
            artistTop10Song.addSong(s4);
            artistTop10Song.addSong(s5);
            artistTop10Song.addSong(s6);
            artistTop10Song.addSong(s7);
            artistTop10Song.addSong(s8);
            artistTop10Song.addSong(s9);
            artistTop10Song.addSong(s10);
            artistTop10Song.addSong(s11);
            artistTop10Song.addSong(s12);
            artistTop10Song.addSong(s13);
            artistTop10Song.addSong(s14);
            artistTop10Song.addSong(s15);
            artistTop10Song.addSong(s16);
            artistTop10Song.addSong(s17);
            artistTop10Song.addSong(s18);
            artistTop10Song.addSong(s19);
            artistTop10Song.addSong(s20);
            artistTop10Song.addSong(s21);
            artistTop10Song.addSong(s22);
            artistTop10Song.addSong(s23);
            artistTop10Song.addSong(s24);
            artistTop10Song.addSong(s25);
            artistTop10Song.addSong(s26);
            artistTop10Song.addSong(s27);
            artistTop10Song.addSong(s28);
            artistTop10Song.addSong(s29);
            artistTop10Song.addSong(s30);
            artistTop10Song.addSong(s31);
            artistTop10Song.addSong(s32);
            artistTop10Song.addSong(s33);
            artistTop10Song.addSong(s34);
            artistTop10Song.addSong(s35);
            artistTop10Song.addSong(s36);
            artistTop10Song.addSong(s37);
            artistTop10Song.addSong(s38);
            artistTop10Song.addSong(s39);
            artistTop10Song.addSong(s40);
            artistTop10Song.addSong(s41);
            artistTop10Song.addSong(s42);
            artistTop10Song.addSong(s43);
            artistTop10Song.addSong(s44);
            artistTop10Song.addSong(s45);
            artistTop10Song.addSong(s46);
            artistTop10Song.addSong(s47);
            artistTop10Song.addSong(s48);
            artistTop10Song.addSong(s49);
            artistTop10Song.addSong(s50);

            //top10 songs on basis of date
            Top10SongDate top10SongDate = new Top10SongDate();
            top10SongDate.addSong(s1);

            //songs which are played less than 5 times
            SongPlayLess songPlayLess = new SongPlayLess();
            songPlayLess.addSong(s1);
            songPlayLess.addSong(s2);
            songPlayLess.addSong(s3);
            songPlayLess.addSong(s4);
            songPlayLess.addSong(s5);
            songPlayLess.addSong(s6);
            songPlayLess.addSong(s7);
            songPlayLess.addSong(s8);
            songPlayLess.addSong(s9);

            //display all this songs
            top10Song.display();
            System.out.println();
            artistTop10Song.display("Sidhu Moosewala");
            System.out.println();
            top10SongDate.display();
            System.out.println();
            songPlayLess.display();



    }
}