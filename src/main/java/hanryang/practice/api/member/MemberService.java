package hanryang.practice.api.member;

public interface MemberService {

    void join(Member member);

    Member findMember(Long memberId);
}