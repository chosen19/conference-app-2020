package io.github.droidkaigi.confsched2020.data.api.internal.response

import io.github.droidkaigi.confsched2020.data.api.response.CategoryItemResponse
import kotlinx.serialization.Serializable

@Serializable
internal data class CategoryItemResponseImpl(
    override val name: LocaledResponseImpl?,
    override val id: Int?,
    override val sort: Int?
) : CategoryItemResponse
