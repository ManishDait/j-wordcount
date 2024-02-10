# jwc - Java Word Count

jwc is a command-line tool written in Java that provides functionality similar to the 'wc' command in Linux. It enables users to count words, lines, characters, and bytes in text files.

## Features

- Counts the number of words, lines, characters and bytes in a given text file.
- Supports processing multiple files at once.
- Provides options for specifying the output format and additional statistics.
- Easy to install and use.
- 
## Usage

```bash
jwc [options] [file1] [file2] ...
```

## Options
- **`-c`, `--bytes`**:Print the byte counts
- **`-m`, `--chars`**: Print the character counts.
- **`-l`, `--lines`**: Print the line counts.
- **`-w`, `--words`**: Print the word counts.
- **`--help`**: Display help message and usage instructions.
- **`--version`**: Output version information.

## Installation

To use jwc, you need to have Java installed on your system. You can download and install Java from [Oracle's website](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html) or use a package manager like [Homebrew](https://brew.sh/) (for macOS) or [APT](https://help.ubuntu.com/community/AptGet/Howto) (for Ubuntu Linux).

Once Java is installed, you can download the jwc binary from the [releases page](https://github.com/ManishDait/java-wordcount/releases).

### Debian Package (.deb)

To install jwc using the Debian package, download the `.deb` file from the [releases page](https://github.com/ManishDait/java-wordcount/releases) and run the following command:

```bash
sudo dpkg -i jwc-1.0.deb
```

### JAR File

If you prefer to use the JAR file directly, download the `jwc-v.1.0.jar` file from the [releases page](https://github.com/ManishDait/java-wordcount/releases) and run the following command:

```bash
java -jar jwc-v.1.0.jar [options] [file1] [file2] ...
```
Replace `[options] [file1] [file2] ...` with the appropriate command-line arguments and filenames.
