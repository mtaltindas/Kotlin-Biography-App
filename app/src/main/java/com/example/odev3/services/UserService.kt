package com.example.odev3.services
import com.example.odev3.models.User
class UserService {
    fun userResult(): List<User> {
        var list = mutableListOf<User>()
        val u1 = User("About me", "https://cdn2.iconfinder.com/data/icons/user-interface-169/32/about-512.png")
        val u2 = User("Gallery", "https://cdn4.iconfinder.com/data/icons/48-bubbles/48/19.Pictures-Night-512.png")
        val u3 = User("Contact", "https://cdn0.iconfinder.com/data/icons/eon-social-media-contact-info-2/32/phone_cellular_contact_call-512.png")
        val u4 = User("Blog", "https://cdn4.iconfinder.com/data/icons/ionicons/512/icon-social-github-outline-512.png")


        list.add(u1)
        list.add(u2)
        list.add(u3)
        list.add(u4)


        return list
    }
}