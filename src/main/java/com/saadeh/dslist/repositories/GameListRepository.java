package com.saadeh.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.saadeh.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long> {

}
