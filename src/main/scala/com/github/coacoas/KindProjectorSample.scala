package com.github.coacoas

import cats.MonadError

import scala.language.higherKinds

object KindProjectorSample {

  def something[F[_] : MonadError[?[_], Throwable]]: F[Int] =
    MonadError[F, Throwable].raiseError(new RuntimeException("That failed"))

}
