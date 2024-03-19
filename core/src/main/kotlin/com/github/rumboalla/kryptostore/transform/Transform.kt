package com.github.rumboalla.kryptostore.transform


interface Transform<T> {

    /**
     * Transforms from T to String.
     *
     * @param   t   {@T}   Object {@T} to transform to String.
     *
     * @return  {@String}  String representation object t.
     */
    fun transform(t: T): String

    /**
     * Transforms from String to T.
     *
     * @param   t   {@String}  String to transform to object T.
     *
     * @return  {T} Object representing String t.
     */
    fun transform(t: String): T

}
