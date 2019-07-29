package com.stackroute.springboot.repository;

import com.stackroute.springboot.domain.Track;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.data.mongodb.repository.MongoRepository;
import java.util.List;

@Repository
public interface TrackRepository extends MongoRepository<Track,Integer> {
   /* @Query("from Track where name =?1")
   List<Track> getTrackByName(String name);*/
  /* @Query("{'id': ?0 }")
   public List<Track> findById(int id);
*/
}

