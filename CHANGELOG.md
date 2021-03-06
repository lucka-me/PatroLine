<div align=center><a href="https://github.com/lucka-me/Patroute-android"><img src="./Resource/Banner.svg" alt="Banner"></a></div>

<h1 align=center>更新日志</h1>

```markdown
## [1.5.0] - 2018-08-29
- 1.4.3(20180813) -> 1.5.0(20180835)
- Structure and code refreshed

### Added
- LocationKit, which can switch between GPS and Network provider automatically

### Changed
- Structure and code refreshed, based on the work of RoundO-android
```

```markdown
## [1.4.3] - 2018-08-12
- 1.4.2(201808010) -> 1.4.3(20180813)

### Fixed
- Distances on cards don't update when location updated
```

```markdown
## [1.4.2] - 2018-08-07
- 1.4.1(201807004) -> 1.4.2(201808010)

### Fixed
- Some error when get Internet time
```

```markdown
## [1.4.1] - 2018-07-31
- 1.4.0(201807003) -> 1.4.1(201807004)

### Added
- Set connect timeout

### Fixed
- App crashed when open -> exit Preference during starting and stopping
```

```markdown
## [1.4.0] - 2018-07-30
- 1.3.1(201807002) -> 1.4.0(201807003)

### Added
- TrumeKit to detect cheating, including mock location, emulation and time trick

### Changed
- Upgrade AMap API to v6.3.1

### Fixed
- App crashes when open About page
- App crashed when open -> exit Preference page during starting, stopping and
  reporting
- Some logical issues
```

```markdown
## [1.3.1] - 2018-07-29
- 1.3.0(201807001) -> 1.3.1(201807002)

### Changed
- Log function improved, add logging when stop failed and report failed
```

```markdown
## [1.3.0] - 2018-07-10
Main update.
- 1.2.1(201806003) -> 1.3.0(201807001)

### Changed
- Rewrote the log function, logs can be reviewd with the web tool now
- Optimized the location usage
```

```markdown
## [1.2.1] - 2018-06-19
Main update.
- 1.2.0(201806002) -> 1.2.1(201806003)

### Changed
- Migrate from AMap 2D Map SDK to AMap 3D Map SDK
- Clean code, the deprecated methods won't be functional any more
```

```markdown
## [1.2.0] - 2018-06-09
Begining of the next step.
- 1.1.4-A(201806001) -> 1.2.0(201806002)

### Changed
- Package Name changed: lab.chd.patroline -> labs.zero_one.patroute
- README update

### Deleted
- Google Maps version
```

```markdown
## [1.1.4] - 2018-06-08
- [AMap] 1.1.3-A(201805001) -> 1.1.4-A(201806001)
- [GMap] 1.1.3-G(201805001) -> 1.1.4-G(201806001)

### Changed
- [Both] Upgrade the Kotlin and Gradle to the last version
```

```markdown
## [1.1.3] - 2018-05-25
- [AMap] 1.1.2-A(201803007) -> 1.1.3-A(201805001)
- [GMap] 1.1.2-G(201803006) -> 1.1.3-G(201805001)

### Fixed
- [Both] Some issues cause app crash when fail to submit or stop mission

### Changed
- [Both] Update the libraries
- [Both] Canceled code shrinking for release due to some unknown issues
```

```markdown
## [1.1.2] - 2018-03-17
[AMap] 1.1.1-A(201803006) -> 1.1.2-A(201803007)
[GMap] 1.1.1-G(201803005) -> 1.1.2-G(201803006)

### Changed
- [AMap] Package Name changed: lab.chd.linep -> lab.chd.patroline
- [GMap] Package Name changed: lab.chd.linep -> lab.chd.patroline.gmap
```

```markdown
## [1.1.1] - 2018-03-17
- [AMap] 1.1.0-A(201803005) -> 1.1.1-A(201803006)
- [GMap] 1.0.3-G(201803004) -> 1.1.1-G(201803005)

### Changed
- [AMap] Minor optimization
- [GMap] Cleaned up code and optimization
```

```markdown
## [1.1.0] - 2018-03-17
- [AMap] 1.0.3(201803004) -> 1.1.0-A(201803005)
- [GMap] 1.0.3(201803004) -> 1.0.3-G(201803004)

### Changed
- [AMap] Rewritten the Waypoint class
- [AMap] Cleaned code
- [AMap] Compiled Kotlin Document (KDoc)
```

```markdown
## [1.0.3] - 2018-03-15
- [Both] 1.0.2(201803003) -> 1.0.3(201803004)

### Added
- [Both] Expaned Dependency List in About page

### Fixed
- [AMap] MapType Preference has no correct default value
```

```markdown
## [1.0.2] - 2018-03-15
- [Both] 1.0.1(201803002) -> 1.0.2(201803003)

### Update
- [AMap] CoordinateKit.convert() support Location? type

### Fixed
- [Both] Mission card don't refresh after checking waypoint
- [AMap] App will crash if it launches with no GPS signal
- [AMap] Coordinate system issue that makes the app calculate with the
  wrong coordinate
```

```markdown
## [1.0.1] - 2018-03-10
- [Both] 1.0.0(201803001) -> 1.0.1(201803002)

### Added
- [Both] MapType Option

### Changed
- [Both] Location Card with Map enhanced
```

```markdown
## [1.0.0] - 2018-03-10
- Initial version
```
