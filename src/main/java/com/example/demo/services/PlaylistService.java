package com.example.demo.services;

import java.util.List;

import com.example.demo.entities.Playlist;
import com.example.demo.entities.Song;

public interface PlaylistService {

	public void addPlaylist(Playlist playlist);

	public List<Playlist> fetchAllPlaylists();

	

	

}
