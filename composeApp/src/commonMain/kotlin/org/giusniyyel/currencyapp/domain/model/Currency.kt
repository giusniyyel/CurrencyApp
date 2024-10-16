package org.giusniyyel.currencyapp.domain.model

import io.realm.kotlin.types.RealmObject
import io.realm.kotlin.types.annotations.PrimaryKey
import kotlinx.serialization.Serializable
import org.mongodb.kbson.ObjectId

@Serializable
open class Currency : RealmObject {
    @PrimaryKey
    var id: ObjectId = ObjectId()
    var code: String = ""
    var value: Double = 0.0

    companion object MyCurrencyCompanion {
        // Your companion object code here
    }
}
