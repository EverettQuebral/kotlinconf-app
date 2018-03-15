package com.jetbrains.kotlinconf.model

/**
 * Created by eq on 3/14/18.
 */
data class FieldsEntity(
		val fields: List<Field>,
		val styles: Styles
)

data class Field(
		val name: String,
		val type: String,
		val value: String,
		val style: String
)

data class Styles(
		val edit_text: EditText
)

data class EditText(
		val size: String,
		val color: String
)