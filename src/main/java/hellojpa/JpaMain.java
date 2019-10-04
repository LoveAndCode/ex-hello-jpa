package hellojpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class JpaMain {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello");
        EntityManager entityManager = emf.createEntityManager();
        EntityTransaction tx = entityManager.getTransaction();
        tx.begin();

        try {
//            Member member = new Member();
//            member.setId(2L);
//            member.setName("HelloB");
//            entityManager.persist(member);
//            tx.commit();
//            Member member = entityManager.find(Member.class, 1L);
//            System.out.printf("ID: %s NAME: %s\n", member.getId(), member.getName());
//            member.setName("HelloA");

//            // 비영속
//            Member member = new Member();
//            member.setId(100L);
//            member.setName("HelloJPA");
//
//            // 영속
//            System.out.println("======== BEFORE ========");
//            entityManager.persist(member);
//            System.out.println("======== AFTER ========");
            // 비영속

//            Member member = new Member();
//            member.setId(10L);
//            member.setName("PersistenceA");
//
//            // 영속
//            System.out.println("======== BEFORE ========");
//            entityManager.persist(member);
//            System.out.println("======== AFTER ========");
//
//            Member findMember = entityManager.find(Member.class, 10L);
//
//            System.out.println("findMember.Id = "+findMember.getId());
//            System.out.println("findMember.Name = "+findMember.getName());

//            Member member1 = entityManager.find(Member.class, 10L);
//            System.out.println("Member.Id = "+member1.getId() + " Member.Name = "+member1.getName());
//            Member member2 = entityManager.find(Member.class, 10L);
//            System.out.println("Member.Id = "+member2.getId() + " Member.Name = "+member2.getName());
//
//
//            System.out.println("Persistence Entity Equal Member1 == Member2 : result -> "+ (member1 == member2));

//            // 영속
//            Member member1 = new Member(11L, "A");
//            Member member2 = new Member(12L, "B");
//
//            entityManager.persist(member1);
//            entityManager.persist(member2);
//
//            System.out.println("=======================");

//            Member member = entityManager.find(Member.class, 1L);
//            member.setId(1L);
//            member.setUsername("A");
//            member.setAge(25);
//            member.setRoleType(RoleType.USER);
//
//            entityManager.persist(member);
//
            Member member = new Member();
            member.setUsername("BA");
            member.setAge(25);
            member.setRoleType(RoleType.USER);

            System.out.println("============================================");
            entityManager.persist(member);
            System.out.println("Member.Id = " + member.getId());
            System.out.println("============================================");

            tx.commit();
        } catch (Exception e) {
            tx.rollback();
        } finally {
            entityManager.close();
        }
        emf.close();
    }

}
