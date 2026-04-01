package kr.gsm.bookerp.repository;

import kr.gsm.bookerp.entity.Reply;
import org.springframework.data.jpa.repository.JpaRepository;

// Hibernate API--------|
public interface ReplyRepository extends JpaRepository<Reply, Long> {
    // CRUD - Reply table 에서 댓글 목록 가져오기..
    // Reply-->Method ? : findAll() - select SQL

}
