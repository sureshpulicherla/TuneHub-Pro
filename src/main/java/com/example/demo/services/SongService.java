package com.example.demo.services;

import java.util.List;

import com.example.demo.entities.Song;

public interface SongService {

	public void addSong(Song song);

	public List<Song> fetchAllSongs();

	public boolean songExists(String name);
	
	public void updateSong(Song song);

	public List<Song> searchSongs(String keyword);


	public Song findSongById(int id);

	public void deleteSong(Song deletedSong);



}
