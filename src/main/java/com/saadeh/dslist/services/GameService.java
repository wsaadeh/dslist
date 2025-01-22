package com.saadeh.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.saadeh.dslist.dto.GameMinDTO;
import com.saadeh.dslist.entities.Game;
import com.saadeh.dslist.repositories.GameRepository;

@Service
public class GameService {

	
	@Autowired
	private GameRepository gameRepository;
	
	public List<GameMinDTO> findAll(){
		List<Game> result = gameRepository.findAll();
		return result.stream().map(x -> new GameMinDTO(x)).toList();		
	}
}
