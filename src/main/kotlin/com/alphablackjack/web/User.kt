package com.alphablackjack.web

import lombok.Data
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Data
@Entity
class User(@Id @GeneratedValue(strategy = GenerationType.AUTO) val id: Long,
           firstName: String,
           lastName: String,
           age: Int,
           email: String)