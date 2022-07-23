# Stockfish library

A library for using Stockfish in android.

## Developers

### Changing the downloaded NNUE file

1. Go to [Stockfish NNUE files page](https://tests.stockfishchess.org/nns) and select a reference from the list.
2. Modify CMakeLists.txt, by replacing line starting by `set (NNUE_NAME )` by setting your reference name, without any quote.
3. Modify the reference name in `evaluate.h` in the line containing `#define EvalFileDefaultName   `, by setting your nnue file name, with the quotes of course.

## Updating Stockfish version

Just change the folder /cpp/stockfish with the sources of the new version, and also adjust the referenced NNUE file, as described above.

If necessary, import the code inside main() function in main.cpp of stockfish source file, into the main() function in cpp/bridge/stockfish.cpp.

## License

MIT

Included code from [Stockfish](https://stockfishchess.org/).

Currently uses the sources of Stockfish 15.