package TOYUXTEAM.BOOKSTORE.repository;

import TOYUXTEAM.BOOKSTORE.domain.Diary;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DiaryRepository extends JpaRepository<Diary, Long> {

}
