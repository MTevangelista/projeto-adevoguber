package br.project_advhevogoober_final.Model

import java.sql.Timestamp
import java.time.LocalDate
import java.util.*

class LawyerProfile(name:String?=null, val surname:String?=null, val phone:String?=null, val ssn:String?=null,val oab_code:String?=null, val birthdate:Date?=null):User(name)