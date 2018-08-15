package com.dimafeng.testcontainers

import org.testcontainers.containers.{KafkaContainer => OTCKafkaContainer}

class KafkaContainer(confluentPlatformVersion: Option[String] = None) extends SingleContainer[OTCKafkaContainer] {

  override val container: OTCKafkaContainer = new OTCKafkaContainer(confluentPlatformVersion.getOrElse("4.0.0"))

}

object KafkaContainer {
  def apply(confluentPlatformVersion: String = null): KafkaContainer = new KafkaContainer(Option(confluentPlatformVersion))
}