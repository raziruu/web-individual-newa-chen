package com.example.newachen.Services;
import com.example.newachen.UserPojo.*;
import com.example.newachen.entity.Booking;
import com.example.newachen.entity.Feedback;
import com.example.newachen.entity.User;

import java.util.List;

public interface UserService {

    List<Booking> fetchAll();



    String save(UserPojo userPojo);
    String update(UserPojo userPojo);

    Booking fetchById(Integer id);
    User getById(Integer id);
    String save(BookingPojo bookingPojo);
    String saveAdmin(AdminBooking adminBooking);

    String submitFeedback(FeedbackPojo feedbackPojo);
    List<Feedback> fetchAllFeedback();
    List<Booking> findApplicationById(Integer id);



    //    Contact fetchById(Integer id);
    void deleteById(Integer id);
    void deleteFeedback(Integer id);
    void deletecomment(Integer id);

    User findByEmail(String email);
//    String save(BlogPojo blogPojo);
//    UserPojo findByEmail(String email);

//    List<Booking> getByKeyword( String keyword);
//    Page<Booking> findPaginated(int pageNo, int pageSize, String sortField, String sortDirection);


}
