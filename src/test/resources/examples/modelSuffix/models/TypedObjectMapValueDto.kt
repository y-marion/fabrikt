package examples.modelSuffix.models

import com.fasterxml.jackson.`annotation`.JsonProperty
import kotlin.Int
import kotlin.String

public data class TypedObjectMapValueDto(
  @param:JsonProperty("code")
  @get:JsonProperty("code")
  public val code: Int? = null,
  @param:JsonProperty("text")
  @get:JsonProperty("text")
  public val text: String? = null,
)
